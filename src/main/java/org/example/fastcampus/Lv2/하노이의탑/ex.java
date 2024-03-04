package org.example.fastcampus.Lv2.하노이의탑;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex {
    List<int[]> list = new ArrayList<>();
    public int[][] solution(int n) {
        int[][] answer = {};

        dfs(n, 1, 2, 3);
        answer = getResult();
        return answer;
    }

    private int[][] getResult() {
        int[][] ans = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    private void dfs(int n, int s, int m, int e) {
        if (n == 1) {
            list.add(new int[]{s, e});
            return;
        }

        dfs(n - 1, s, e, m);
        list.add(new int[]{s, e});
        dfs(n - 1, m, s, e);
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[][] solution = sol.solution(2);

        for (int[] solu : solution) {
            System.out.println("solution = " + Arrays.toString(solu));
        }
    }
}
