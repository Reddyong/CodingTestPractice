package org.example.fastcampus.Lv1.이웃한칸;

public class ex {
    int[] dx = new int[]{0, 1, 0, -1};
    int[] dy = new int[]{1, 0, -1, 0};
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        answer = getSameColor(board, h, w);
        return answer;
    }

    private int getSameColor(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;

        for (int i = 0; i < 4; i++) {
            int hCheck = h + dy[i];
            int wCheck = w + dx[i];

            if (isCorrectLocation(hCheck, wCheck, n)) {
                if (board[h][w].equals(board[hCheck][wCheck])) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isCorrectLocation(int hCheck, int wCheck, int n) {
        if (hCheck < 0 || wCheck < 0 || hCheck >= n || wCheck >= n) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new String[][]{{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}}, 1, 1);
        int solution2 = sol.solution(new String[][]{{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}}, 0, 1);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
