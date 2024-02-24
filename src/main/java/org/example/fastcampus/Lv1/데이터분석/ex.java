package org.example.fastcampus.Lv1.데이터분석;

import java.util.Arrays;

public class ex {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer;

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[][] solution = sol.solution(new int[][]{{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}}, "date", 20300501, "remain");

        for (int[] solu : solution) {
            System.out.println(Arrays.toString(solu));
        }

    }
}
