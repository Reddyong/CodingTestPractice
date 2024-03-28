package org.example.fastcampus.Lv1.숫자짝꿍;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ex {
    PriorityQueue<String> pqX;
    PriorityQueue<String> pqY;
    public String solution(String X, String Y) {
        String answer = "";

        initQueue(X, Y);
        answer = getPartnerNum();

        return answer;
    }

    private String getPartnerNum() {
        PriorityQueue<String> ans = new PriorityQueue<>(Comparator.reverseOrder());

        while (!pqX.isEmpty() && !pqY.isEmpty()) {
            int x = Integer.parseInt(pqX.peek());
            int y = Integer.parseInt(pqY.peek());

            if (x > y) {
                pqX.poll();
                continue;
            }

            if (x < y) {
                pqY.poll();
                continue;
            }

            if (!ans.isEmpty() && ans.peek().equals("0") && x == 0) {
                return "0";
            }

            ans.add(String.valueOf(x));
            pqX.poll();
            pqY.poll();
        }

        return getAnsToStr(ans);
    }

    private String getAnsToStr(PriorityQueue<String> ans) {
        if (ans.isEmpty()) {
            return "-1";
        }

        StringBuilder sb = new StringBuilder();

        for (String a : ans) {
            sb.append(a);
        }

        return sb.toString();
    }

    private void initQueue(String x, String y) {
        pqX = new PriorityQueue<>(Comparator.reverseOrder());
        pqY = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < x.length(); i++) {
            String cur = x.substring(i, i + 1);
            pqX.add(cur);
        }

        for (int i = 0; i < y.length(); i++) {
            String cur = y.substring(i, i + 1);
            pqY.add(cur);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution("100", "2345");
        String solution2 = sol.solution("100", "203045");
        String solution3 = sol.solution("100", "123450");
        String solution4 = sol.solution("12321", "42531");
        String solution5 = sol.solution("5525", "1255");

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
        System.out.println("solution4 = " + solution4);
        System.out.println("solution5 = " + solution5);
    }
}
