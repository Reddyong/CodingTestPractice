package org.example.fastcampus.Lv1.바탕화면정리;

import java.util.Arrays;

public class ex {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};

        return answer;
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
