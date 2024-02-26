package org.example.fastcampus.Lv1.성격유형검사하기;

import java.util.HashMap;
import java.util.Map;

public class ex {
    Map<String, Integer> map = new HashMap<>();
    String temp = "";
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        initChoices(choices);

        return answer;
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
