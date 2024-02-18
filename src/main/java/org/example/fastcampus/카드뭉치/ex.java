package org.example.fastcampus.카드뭉치;

public class ex {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        String solution2 = sol.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
