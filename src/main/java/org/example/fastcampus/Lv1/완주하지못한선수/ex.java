package org.example.fastcampus.Lv1.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

public class ex {
    Map<String, Integer> map = new HashMap<>();
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        initMap(participant);
        answer = didNotCompleted(completion);

        return answer;
    }

    private String didNotCompleted(String[] completion) {
        String ans = "";

        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) != 0) {
                ans = s;
            }
        }

        return ans;
    }

    private void initMap(String[] participant) {
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        String solution2 = sol.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        String solution3 = sol.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
