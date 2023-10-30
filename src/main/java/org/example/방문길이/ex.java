package org.example.방문길이;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ex {
    int[] row = {0, 1, 0, -1};
    int[] col = {-1, 0, 1, 0};
    public int solution(String dirs) {
        int answer = 0;
        boolean[][][] visited = new boolean[11][11][4];

        int r = 5;
        int c = 5;

        for (int i = 0; i < dirs.length(); i++) {
            char cur = dirs.charAt(i);
            int d = 0;
            if (cur == 'U') {
                d = 0;
            }
            if (cur == 'R') {
                d = 1;
            }
            if (cur == 'D') {
                d = 2;
            }
            if (cur == 'L') {
                d = 3;
            }
            int nr = r + row[d];
            int nc = c + col[d];

            if (nr < 0 || nc < 0 || nr >= 11 || nc >= 11) {
                continue;
            }
            if (!visited[nr][nc][d]) {
                visited[nr][nc][d] = true;
                d = (d % 2 == 0) ? (2 - d) : (4 - d);
                visited[r][c][d] = true;
                answer++;
            }
            r = nr;
            c = nc;
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution("ULURRDLLU");
        int solution2 = sol.solution("LULLLLLLU");

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
