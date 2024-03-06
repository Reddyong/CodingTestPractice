package org.example.fastcampus.Lv2.도넛과막대그래프;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ex {
    int eight = 0;
    int stick = 0;
    int creationPoint = 0;
    int mapCount = 0;
    Map<Integer, Integer> inputMap = new HashMap<>();
    Map<Integer, Integer> outputMap = new HashMap<>();
    public int[] solution(int[][] edges) {
        int[] answer = {};

        initMaps(edges);

        return answer;
    }

    private void initMaps(int[][] edges) {
        for (int[] edge : edges) {
            inputMap.put(edge[0], inputMap.getOrDefault(edge[0], 0) + 1);
            outputMap.put(edge[1], outputMap.getOrDefault(edge[1], 0) + 1);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new int[][]{{2, 3}, {4, 3}, {1, 1}, {2, 1}});
        int[] solution2 = sol.solution(new int[][]{{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}, {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
