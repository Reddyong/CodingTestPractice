package org.example.압축;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex {
    Map<String, Integer> map = new HashMap<>();
    public int[] solution(String msg) {
        int[] answer;
        List<Integer> list = new ArrayList<>();

        int num = 1;
        for (int i = 'A'; i <= 'Z'; i++) {
            map.put(String.valueOf((char) i), num++);
        }

        int index = 0;
        while (index < msg.length()) {
            String w = "";
            while (index < msg.length()) {
                if (!map.containsKey(w + msg.charAt(index))) {
                    break;
                } else {
                    w += msg.charAt(index);
                }
                index++;
            }

            list.add(map.get(w));
            if (index < msg.length()) {
                map.put(w + msg.charAt(index), num++);
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution("KAKAO");
        int[] solution2 = sol.solution("TOBEORNOTTOBEORTOBEORNOT");
        int[] solution3 = sol.solution("ABABABABABABABAB");

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
