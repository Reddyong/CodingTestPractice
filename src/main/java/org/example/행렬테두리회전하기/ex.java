package org.example.행렬테두리회전하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ex {
    int[][] arr;
    int[] answer;
    public int[] solution(int rows, int columns, int[][] queries) {
        answer = new int[queries.length];
        arr = new int[rows][columns];

        initArr(rows, columns);
        queries = initQueries(queries);

        solve(queries);

        return answer;
    }

    private void solve(int[][] queries) {
        int cnt = 0;
        for (int[] query : queries) {
            int x1 = query[0];
            int y1 = query[1];
            int x2 = query[2];
            int y2 = query[3];

            int a = rotation(x1, y1, x2, y2);
            answer[cnt++] = a;
        }
    }

    private int rotation(int x1, int y1, int x2, int y2) {
        int count = (x2 - x1 + 1) * (y2 - y1 + 1) - (x2 - x1 - 1) * (y2 - y1 - 1);
        int check = 0;
        int curX = x1;
        int curY = y1;
        int temp = arr[x1][y1];
        List<Integer> list = new ArrayList<>();

        while (check < count) {
            list.add(temp);

            if (curX == x1 && curY < y2) {
                curY++;
            } else if (curX < x2 && curY == y2) {
                curX++;
            } else if (curX == x2 && curY > y1) {
                curY--;
            } else if (curX > x1 && curY == y1) {
                curX--;
            }

            int newTemp = arr[curX][curY];
            arr[curX][curY] = temp;
            temp = newTemp;

            check++;
        }

        list.sort(((o1, o2) -> o1 - o2));

        return list.get(0);
    }

    private int[][] initQueries(int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < queries[i].length; j++) {
                queries[i][j]--;
            }
        }

        return queries;
    }

    private void initArr(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = i * columns + j + 1;
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(6, 6, new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}});
        int[] solution2 = sol.solution(3, 3, new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}});
        int[] solution3 = sol.solution(100, 97, new int[][]{{1, 1, 100, 97}});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
    }
}
