package org.example.fastcampus.Lv2.가장큰정사각형찾기;

public class ex {
    int[][] dp;
    int R;
    int N;
    public int solution(int[][] board){
        int answer = 1234;

        init(board);

        return answer;
    }

    private void init(int[][] board) {
        R = board.length;
        N = board[0].length;
        dp = new int[R][N];

        for (int i = 0; i < R; i++) {
            dp[i][0] = board[i][0];
        }

        for (int j = 0; j < N; j++) {
            dp[0][j] = board[0][j];
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}});
        int solution2 = sol.solution(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
