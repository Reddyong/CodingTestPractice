package org.example.fastcampus.Lv1.키패드누르기;

public class ex {
    public String solution(int[] numbers, String hand) {
        String answer = "";



        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
        String solution2 = sol.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
        String solution3 = sol.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right");

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
