package org.example.fastcampus.Lv2.리코쳇로봇;

import java.util.LinkedList;
import java.util.Queue;

public class ex {
    int curRx;
    int curRy;
    int goalX;
    int goalY;
    boolean[][] visited;
    int[] dx = new int[]{1, 0, -1, 0};
    int[] dy = new int[]{0, 1, 0, -1};
    public int solution(String[] board) {
        int answer = 0;

        initCurAndGoal(board);
        answer = findRoute(board);

        return answer;
    }

    private int findRoute(String[] board) {
        Queue<int[]> queue = new LinkedList<>();
        int depth = 0;

        queue.add(new int[]{curRy, curRx, depth});
        visited[curRy][curRx] = true;

        while (!queue.isEmpty()) {
            int[] location = queue.poll();
            depth = location[2];

            if (location[1] == goalX && location[0] == goalY) {
                return depth;
            }

            for (int i = 0; i < 4; i++) {
                int x = location[1];
                int y = location[0];

                while (isInBoard(x, y, board) && board[y].charAt(x) != 'D') {
                    x += dx[i];
                    y += dy[i];
                }

                x -= dx[i];
                y -= dy[i];

                if (visited[y][x] || (x == location[1] && y == location[0])) {
                    continue;
                }

                visited[y][x] = true;

                queue.add(new int[]{y, x, depth + 1});
            }
        }

        return -1;
    }

    private boolean isInBoard(int x, int y, String[] board) {
        if (x < 0 || y < 0 || x >= board[0].length() || y >= board.length) {
            return false;
        }
        return true;
    }

    private void initCurAndGoal(String[] board) {
        visited = new boolean[board.length][board[0].length()];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                char cur = board[i].charAt(j);

                if (cur == 'R') {
                    curRx = j;
                    curRy = i;
                }

                if (cur == 'G') {
                    goalX = j;
                    goalY = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."});
        int solution2 = sol.solution(new String[]{".D.R", "....", ".G..", "...D"});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
