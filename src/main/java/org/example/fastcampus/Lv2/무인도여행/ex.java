package org.example.fastcampus.Lv2.무인도여행;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ex {
    Map<Integer, Integer> islands;
    boolean[][] visited;
    int[] dx = new int[]{1, 0, -1, 0};
    int[] dy = new int[]{0, 1, 0, -1};
    public int[] solution(String[] maps) {
        int[] answer = {};

        init(maps);


        return answer;
    }

    private void init(String[] maps) {
        islands = new HashMap<>();
        visited = new boolean[maps.length][maps[0].length()];
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new String[]{"X591X", "X1X5X", "X231X", "1XXX1"});
        int[] solution2 = sol.solution(new String[]{"XXX", "XXX", "XXX"});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
