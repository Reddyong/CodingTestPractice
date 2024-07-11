package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class MyPractice {
    int cursor;
    public String solution(String inputString, int num, String[] input) {
        cursor = inputString.length();

        for (String in : input) {
            String substring = in.substring(0, 1);

            if (substring.equals("L")) {
                if (cursor == 1) {
                    continue;
                }

                cursor--;

            } else if (substring.equals("D")) {
                if (cursor == inputString.length()) {
                    continue;
                }

                cursor++;

            } else if (substring.equals("B")) {
                if (cursor == 1) {
                    continue;
                }
                // abcd
                inputString = inputString.substring(0, cursor - 1) + inputString.substring(cursor);
                cursor--;

            } else {
                // abcd x -> abcxd
                String addStr = in.substring(2, 3);
                inputString = inputString.substring(0, cursor) + addStr + inputString.substring(cursor);
                cursor++;
            }
        }

        return inputString;

    }

    public static void main(String[] args) {
        MyPractice sol = new MyPractice();

        String solution1 = sol.solution("abcd", 3, new String[]{"P x", "L", "P y"});
        String solution2 = sol.solution("dmih", 11, new String[]{"B", "B", "P x", "L", "B", "B", "B", "P y", "D", "D", "P z"});


        System.out.println("solution = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
