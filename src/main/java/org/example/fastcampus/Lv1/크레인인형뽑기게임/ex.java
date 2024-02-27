package org.example.fastcampus.Lv1.크레인인형뽑기게임;

import java.util.Arrays;
import java.util.Stack;

public class ex {
    Stack<Integer> stack = new Stack<>();
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        moves = movesToIndex(moves);
        answer = getTotal(board, moves);

        return answer;
    }

    private int getTotal(int[][] board, int[] moves) {
        int ans = 0;

        for (int move : moves) {
            int num = findNum(board, move);

            if (num == -1) {
                continue;
            }

            if (!stack.isEmpty() && num == stack.peek()) {
                stack.pop();
                ans += 2;
                continue;
            }

            stack.push(num);
        }

        return ans;
    }

    private int findNum(int[][] board, int move) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][move] != 0) {
                int temp = board[i][move];
                board[i][move] = 0;
                return temp;
            }
        }

        return -1;
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
