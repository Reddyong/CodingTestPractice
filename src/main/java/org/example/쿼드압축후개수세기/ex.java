package org.example.쿼드압축후개수세기;

public class ex {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        int n = arr.length;

        dAndC(arr, answer, n);
        return answer;
    }

    public int[] dAndC(int[][] arr, int[] answer, int n) {

    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}});
        int[] solution2 = sol.solution(new int[][]{{1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 1, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0, 0, 1}, {0, 0, 0, 0, 1, 1, 1, 1}});

        for (int i : solution1) {
            System.out.println("i1 = " + i);
        }
        for (int i : solution2) {
            System.out.println("i2 = " + i);
        }
    }
}
