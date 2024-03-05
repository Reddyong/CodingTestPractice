package org.example.fastcampus.Lv1.신규아이디추천;

import java.util.*;

public class ex {
    Set<Character> signSet;
    String saveStr;
    char[] saveId;
    public String solution(String new_id) {
        String answer = "";

        init(new_id);
        changeLowerCase();

        return answer;
    }

    private void changeLowerCase() {
        for (int i = 0; i < saveId.length; i++) {
            if (Character.isAlphabetic(saveId[i])) {
                saveId[i] = Character.toLowerCase(saveId[i]);
            }
        }
    }

    private void init(String newId) {
        saveStr = "";
        saveId = newId.toCharArray();
        signSet = new HashSet<>(Set.of('-', '_', '.'));
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution("...!@BaT#*..y.abcdefghijklm");
        String solution2 = sol.solution("z-+.^.");
        String solution3 = sol.solution("=.=");
        String solution4 = sol.solution("123_.def");
        String solution5 = sol.solution("abcdefghijklmn.p");

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
        System.out.println("solution4 = " + solution4);
        System.out.println("solution5 = " + solution5);
    }
}
