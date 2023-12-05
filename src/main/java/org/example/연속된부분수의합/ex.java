package org.example.연속된부분수의합;

public class ex {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new int[]{1, 2, 3, 4, 5}, 7);
        int[] solution2 = sol.solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5);
        int[] solution3 = sol.solution(new int[]{2, 2, 2, 2, 2}, 6);

        for (int s1 : solution1) {
            System.out.println("s1 = " + s1);
        }

        for (int s2 : solution2) {
            System.out.println("s2 = " + s2);
        }

        for (int s3 : solution3) {
            System.out.println("s3 = " + s3);
        }
    }
}
