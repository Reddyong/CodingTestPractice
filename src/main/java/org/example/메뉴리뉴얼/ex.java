package org.example.메뉴리뉴얼;

import java.util.*;
import java.util.stream.Stream;

public class ex {
    Map<String, Integer> map;
    int max;
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        List<String> answerList = new ArrayList<>();

        for (int c : course) {
            map = new HashMap<>();
            max = 0;

            for (String order : orders) {
                char[] charArray = order.toCharArray();
                Arrays.sort(charArray);
                order = new String(charArray);
                solve(0, -1, order, "", c);
            }

            for (String key : map.keySet()) {
                Integer val = map.get(key);
                if (val > 1 && val == max) {
                    answerList.add(key);
                }
            }
        }

        Collections.sort(answerList);
        answer = answerList.toArray(new String[answerList.size()]);

        return answer;
    }

    private void solve(int curStep, int preIdx, String order, String cur, int cnt) {
        if (curStep == cnt) {
            map.put(cur, map.getOrDefault(cur, 0) + 1);
            max = Math.max(max, map.get(cur));
        }

        for (int i = preIdx + 1; i < order.length(); i++) {
            solve(curStep + 1, i, order, cur + order.charAt(i), cnt);
        }
    }


    public static void main(String[] args) {
        ex sol = new ex();
        String[] solution1 = sol.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4});
        String[] solution2 = sol.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5});
        String[] solution3 = sol.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
    }
}
