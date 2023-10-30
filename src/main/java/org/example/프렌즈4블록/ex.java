package org.example.프렌즈4블록;

public class ex {
    char[][] blocks;
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        blocks = new char[m][n];

        for (int i = 0; i < m; i++) {
            blocks[i] = board[i].toCharArray();
        }

        while (true) {
            int count = checkBlock(m, n);
            if (count == 0) {
                break;
            }
            answer += count;
        }


        return answer;
    }

    public int checkBlock(int m, int n) {
        int cnt = 0;
        boolean[][] check = new boolean[m][n];

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (blocks[i][j] != '!' && checkFour(i, j)) {
                    check[i][j] = true;
                    check[i + 1][j] = true;
                    check[i][j + 1] = true;
                    check[i + 1][j + 1] = true;
                }
            }
        }

        cnt = updateBlock(check, m, n);

        while (true) {
            if (!dropBlock(m, n)) {
                break;
            }
        }

        return cnt;
    }

    public int updateBlock(boolean[][] check, int m, int n) {
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (check[i][j]) {
                    blocks[i][j] = '!';
                    ans++;
                }
            }
        }

        return ans;
    }

    public boolean checkFour(int i, int j) {
        char c = blocks[i][j];
        return (c == blocks[i][j + 1] && c == blocks[i + 1][j] && c == blocks[i + 1][j + 1]);
    }

    public boolean dropBlock(int m, int n) {
        boolean isMoved = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (blocks[j][i] != '!' && blocks[j + 1][i] == '!') {
                    blocks[j + 1][i] = blocks[j][i];
                    blocks[j][i] = '!';
                    isMoved = true;
                }
            }
        }

        return isMoved;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"});
        int solution2 = sol.solution(6, 6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
