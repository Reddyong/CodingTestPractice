package org.example.fastcampus.Lv2.거리두기확인하기;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ex {
    int[] dx = new int[]{1, 0, -1, 0};
    int[] dy = new int[]{0, 1, 0, -1};
    public int[] solution(String[][] places) {
        int[] answer = {};

        answer = getResult(places);

        return answer;
    }

    private int[] getResult(String[][] places) {
        int[] ans = new int[5];

        for (int i = 0; i < places.length; i++) {
            String[] place = places[i];
            boolean flag = true;

            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (place[j].charAt(k) == 'P') {
                        if (!bfs(j, k, place)) {
                            flag = false;
                        }
                    }
                }
            }

            if (flag) {
                ans[i] = 1;
                continue;
            }

            ans[i] = 0;
        }

        return ans;
    }

    private boolean bfs(int r, int c, String[] place) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[5][5];

        queue.add(new int[]{r, c});
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = poll[1] + dx[i];
                int ny = poll[0] + dy[i];

                int m = getManhattanDistance(r, c, ny, nx);

                if (isInBoard(nx, ny) && !visited[ny][nx] && m <= 2) {
                    if (place[ny].charAt(nx) == 'P') {
                        return false;
                    }

                    if (place[ny].charAt(nx) == 'X') {
                        continue;
                    }

                    if (place[ny].charAt(nx) == 'O') {
                        queue.add(new int[]{ny, nx});
                        visited[ny][nx] = true;
                    }
                }
            }
        }

        return true;
    }

    private boolean isInBoard(int nx, int ny) {
        if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5) {
            return false;
        }

        return true;
    }

    private int getManhattanDistance(int r, int c, int ny, int nx) {
        return Math.abs(r - ny) + Math.abs(c - nx);
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution = sol.solution(new String[][]{{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}});

        System.out.println("solution = " + Arrays.toString(solution));
    }
}
