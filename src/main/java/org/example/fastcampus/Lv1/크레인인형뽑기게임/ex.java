package org.example.fastcampus.Lv1.크레인인형뽑기게임;

import java.util.Arrays;
import java.util.Stack;

public class ex {
    Stack<Integer> stack = new Stack<>();
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        moves = movesToIndex(moves);

        return answer;
    }

    private int[] movesToIndex(int[] moves) {
        for (int i = 0; i < moves.length; i++) {
            moves[i]--;
        }

        return moves;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4});

        System.out.println("solution = " + solution);
    }
}
