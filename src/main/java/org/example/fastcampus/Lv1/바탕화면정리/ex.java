package org.example.fastcampus.Lv1.바탕화면정리;

import java.util.Arrays;

public class ex {
    int lux = Integer.MAX_VALUE;
    int luy = Integer.MAX_VALUE;
    int rdx = Integer.MIN_VALUE;
    int rdy = Integer.MIN_VALUE;
    public int[] solution(String[] wallpaper) {
        int[] answer = {};

        findLowestLocation(wallpaper);
        answer = getResult();

        return answer;
    }

    private int[] getResult() {
        int[] ans = new int[4];

        ans[0] = lux;
        ans[1] = luy;
        ans[2] = rdx + 1;
        ans[3] = rdy + 1;

        return ans;
    }

    private void findLowestLocation(String[] wallpaper) {
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                char cur = wallpaper[i].charAt(j);

                if (cur == '#') {
                    changeCoordinate(i, j);
                }
            }
        }
    }

    private void changeCoordinate(int i, int j) {
        if (j < luy) {
            luy = j;
        }
        if (i < lux) {
            lux = i;
        }
        if (j > rdy) {
            rdy = j;
        }
        if (i > rdx) {
            rdx = i;
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new String[]{".#...", "..#..", "...#."});
        int[] solution2 = sol.solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
        int[] solution3 = sol.solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."});
        int[] solution4 = sol.solution(new String[]{"..", "#."});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
        System.out.println("solution4 = " + Arrays.toString(solution4));
    }
}
