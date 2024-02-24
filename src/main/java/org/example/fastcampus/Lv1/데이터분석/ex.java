package org.example.fastcampus.Lv1.데이터분석;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sun.tools.javac.util.Context.checkState;

public class ex {
    int extNum;
    int sortNum;
    List<int[]> saveList = new ArrayList<>();
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer;

        initList(data, ext, val_ext, sort_by);

        return answer;
    }

    private void initList(int[][] data, String ext, int valExt, String sortBy) {
        extNum = checkState(ext);
        sortNum = checkState(sortBy);

        for (int[] d : data) {
            int temp = d[extNum];

            if (valExt > temp) {
                saveList.add(d);
            }
        }
    }

    private int checkState(String cur) {
        if (cur.equals("code")) {
            return 0;
        }
        if (cur.equals("date")) {
            return 1;
        }
        if (cur.equals("maximum")) {
            return 2;
        }

        return 3;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[][] solution = sol.solution(new int[][]{{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}}, "date", 20300501, "remain");

        for (int[] solu : solution) {
            System.out.println(Arrays.toString(solu));
        }

    }
}
