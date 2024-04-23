package org.example.fastcampus.Lv2.가장큰정사각형찾기;

public class ex {
    int[][] dp;
    int R;
    int N;
    int side;
    public int solution(int[][] board){
        int answer = 1234;

        init(board);
        answer = getMaxSquare(board);

        return answer;
    }

    private void init(int[][] board) {
        R = board.length;
        N = board[0].length;
        side = 0;
        dp = new int[R][N];

        for (int i = 0; i < R; i++) {
            dp[i][0] = board[i][0];
        }

        for (int j = 0; j < N; j++) {
            dp[0][j] = board[0][j];
        }
    }

    private int getMaxSquare(int[][] board) {
        if (R == 1 && N == 1) {
            return board[0][0] * board[0][0];
        }

        for (int i = 1; i < R; i++) {
            for (int j = 1; j < N; j++) {
                if (board[i][j] == 0) {
                    dp[i][j] = 0;
                    continue;
                }

                dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                side = Math.max(dp[i][j], side);
            }
        }

        return side * side;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}});
        int solution2 = sol.solution(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
