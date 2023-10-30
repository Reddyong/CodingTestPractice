package org.example.주차요금계산;

import java.util.*;

public class ex {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> timeMap = new HashMap<>();
        Set<String> checkSet = new HashSet<>();
        PriorityQueue<String> queue = new PriorityQueue<>();

        tSolve(records, timeMap, checkSet, queue);

        int[] answer = new int[queue.size()];

        mSolve(queue, timeMap, fees, answer);

        return answer;
    }

    public void tSolve(String[] records, Map<String, Integer> timeMap, Set<String> checkSet, PriorityQueue<String> queue) {
        for (String record : records) {
            String[] split = record.split(" ");
            String[] timeSplit = split[0].split(":");
            int time = Integer.parseInt(timeSplit[0]) * 60 + Integer.parseInt(timeSplit[1]);
            if (split[2].equals("IN")) {
                timeMap.put(split[1], time - timeMap.getOrDefault(split[1], 0));
                checkSet.add(split[1]);
            } else if (split[2].equals("OUT")) {
                timeMap.put(split[1], time - timeMap.get(split[1]));
                checkSet.remove(split[1]);
            }
        }

        if (!checkSet.isEmpty()) {
            for (String s : checkSet) {
                timeMap.put(s, 1439 - timeMap.get(s));
            }
        }

        for (String s : timeMap.keySet()) {
            queue.add(s);
        }
    }

    public void mSolve(PriorityQueue<String> queue, Map<String, Integer> timeMap, int[] fees, int[] answer) {
        for (int i = 0; i < answer.length; i++) {
            String poll = queue.poll();
            Integer t = timeMap.get(poll);
            if (t <= fees[0]) {
                answer[i] = fees[1];
                continue;
            }
            double d = (t - fees[0]) / (double) fees[2];
            d = Math.ceil(d);
            answer[i] = fees[1] + ((int) d * fees[3]);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new int[]{180, 5000, 10, 600}, new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"});
        int[] solution2 = sol.solution(new int[]{120, 0, 60, 591}, new String[]{"16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"});
        int[] solution3 = sol.solution(new int[]{1, 461, 1, 10}, new String[]{"00:00 1234 IN"});

        for (int i : solution1) {
            System.out.println("i = " + i);
        }
        for (int i : solution2) {
            System.out.println("i = " + i);
        }
        for (int i : solution3) {
            System.out.println("i = " + i);
        }

    }
}
