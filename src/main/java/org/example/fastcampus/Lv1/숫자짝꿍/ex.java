package org.example.fastcampus.Lv1.숫자짝꿍;

public class ex {
    public String solution(String X, String Y) {
        String answer = "";

        return answer;
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
