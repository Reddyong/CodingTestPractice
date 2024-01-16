package org.example.괄호변환;

public class ex {
    public String solution(String p) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution("(()())()");
        String solution2 = sol.solution(")(");
        String solution3 = sol.solution("()))((()");

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
