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

        return answer;
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
        if (i < luy) {
            luy = i;
        }
        if (j < lux) {
            lux = j;
        }
        if (i > rdy) {
            rdy = i;
        }
        if (j > rdx) {
            rdx = j;
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
