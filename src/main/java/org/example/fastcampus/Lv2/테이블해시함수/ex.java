package org.example.fastcampus.Lv2.테이블해시함수;

import java.util.Arrays;

public class ex {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;

        sortData(data, col);


        return answer;
    }

    private void sortData(int[][] data, int col) {
        Arrays.sort(data, ((o1, o2) -> {
            if (o1[col - 1] == o2[col - 1]) {
                return o2[0] - o1[0];
            }

            return o1[col - 1] - o2[col - 1];
        }));
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(new int[][]{{2, 2, 6}, {1, 5, 10}, {4, 2, 9}, {3, 8, 3}}, 2, 2, 3);

        System.out.println("solution = " + solution);
    }
}
