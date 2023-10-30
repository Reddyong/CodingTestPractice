package org.example.등굣길;

public class ex {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] check = new int[n][m];

        for (int[] puddle : puddles) {
            int x = puddle[1] - 1;
            int y = puddle[0] - 1;
            check[x][y] = -1;
        }

        check[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (check[i][j] == 0) {
                    if (i != 0 && check[i - 1][j] != -1) {
                        check[i][j] += check[i - 1][j];
                    }
                    if (j != 0 && check[i][j - 1] != -1) {
                        check[i][j] += check[i][j - 1];
                    }

                    check[i][j] %= 1000000007;
                }
            }
        }

        answer = check[n - 1][m - 1];

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(4, 3, new int[][]{{2, 2}});
        System.out.println("solution = " + solution);
    }
}
