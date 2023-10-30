package org.example;

public class ex8 {
    public String solution(String s) {
        String answer = "";

        String lowerCase = s.toLowerCase();

        for (int i = 1; i < lowerCase.length(); i++) {
            if (lowerCase.charAt(i) != ' ' && lowerCase.charAt(i - 1) == ' ') {
                String first = lowerCase.substring(0, i);
                String mid = lowerCase.substring(i, i + 1);
                String end = lowerCase.substring(i + 1);
                String changedMid = mid.toUpperCase();
                lowerCase = first + changedMid + end;
            }
        }
        String firstString = lowerCase.substring(0, 1);
        String lastString = lowerCase.substring(1);
        String changedFirst = firstString.toUpperCase();
        lowerCase = changedFirst + lastString;

        answer = lowerCase;

        return answer;
    }
    public static void main(String[] args) {
        ex8 sol = new ex8();
        String solution = sol.solution("3people  unFollowed  me");
        System.out.println("solution = " + solution);
    }
}
