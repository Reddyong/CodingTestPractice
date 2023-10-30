package org.example;

import java.util.ArrayList;

public class ex9 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int count = 0;

        while (true) {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    list.add("1");
                } else {
                    zeroCount++;
                }
            }
            int size = list.size();
            String binaryString = Integer.toBinaryString(size);
            s = binaryString;
            count++;
            if (s.equals("1")) {
                break;
            }
            list.clear();
        }
        answer[0] = count;
        answer[1] = zeroCount;

        return answer;
    }

    public static void main(String[] args) {
        ex9 sol = new ex9();
        int[] solution = sol.solution("110010101001");
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
