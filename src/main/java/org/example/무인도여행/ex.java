package org.example.무인도여행;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex {
    private int sum;
    private boolean[][] visited;
    private List<Integer> answerList;
    public int[] solution(String[] maps) {
        int[] answer = {};
        visited = new boolean[maps.length][maps[0].length()];
        answerList = new ArrayList<>();

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                dfs(maps, i, j);
                if (sum > 0) {
                    answerList.add(sum);
                    sum = 0;
                }
            }
        }

        if (answerList.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    private void dfs(String[] maps, int i, int j) {
        if (i < 0 || j < 0 || i >= maps.length || j >= maps[i].length()) {
            return;
        }
        if (maps[i].charAt(j) == 'X' || visited[i][j]) {
            return;
        }

        visited[i][j] = true;
        sum += maps[i].charAt(j) - '0';

        dfs(maps, i + 1, j);
        dfs(maps, i, j + 1);
        dfs(maps, i - 1, j);
        dfs(maps, i, j - 1);
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new String[]{"X591X", "X1X5X", "X231X", "1XXX1"});
        int[] solution2 = sol.solution(new String[]{"XXX", "XXX", "XXX"});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
