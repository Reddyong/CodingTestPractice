package org.example.fastcampus.Lv1.성격유형검사하기;

import java.util.HashMap;
import java.util.Map;

public class ex {
    Map<String, Integer> map = new HashMap<>();
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        initChoices(choices);
        initMap(survey, choices);
        answer = getResult();

        return answer;
    }

    private String getResult() {
        StringBuilder sb = new StringBuilder();

        if (map.get("R") - map.get("T") >= 0) {
            sb.append("R");
        } else {
            sb.append("T");
        }

        if (map.get("C") - map.get("F") >= 0) {
            sb.append("C");
        } else {
            sb.append("F");
        }

        if (map.get("J") - map.get("M") >= 0) {
            sb.append("J");
        } else {
            sb.append("M");
        }

        if (map.get("A") - map.get("N") >= 0) {
            sb.append("A");
        } else {
            sb.append("N");
        }

        return sb.toString();
    }

    private void initMap(String[] survey, int[] choices) {
        initFirstMap();

        for (int i = 0; i < survey.length; i++) {
            String[] split = survey[i].split("");

            if (choices[i] > 0) {
                map.put(split[1], map.get(split[1]) + choices[i]);
                continue;
            }

            if (choices[i] < 0) {
                map.put(split[0], map.get(split[0]) + (-1) * choices[i]);
            }
        }
    }

    private void initFirstMap() {
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);
    }

    private void initChoices(int[] choices) {
        for (int i = 0; i < choices.length; i++) {
            choices[i] -= 4;
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
        String solution2 = sol.solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
