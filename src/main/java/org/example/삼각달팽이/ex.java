package org.example.삼각달팽이;

import java.util.ArrayList;
import java.util.List;

public class ex {
    public int[] solution(int n) {
        int[] answer = init(n);
        int[][] triangle = new int[n][n];
        int x = -1;
        int y = 0;
        int num = 1;

        fillTriangle(n, triangle, x, y, num);
        return answer;
    }

    private static void fillTriangle(int n, int[][] triangle, int x, int y, int num) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (j % 3 == 0) {
                    x++;
                } else if (j % 3 == 1) {
                    y++;
                } else {
                    x--;
                    y--;
                }
                triangle[x][y] = num;
                num++;
            }
        }
    }

    private static int[] init(int n) {
        int[] answer;
        int size = 0;
        for (int i = 1; i <= n; i++) {
            size += i;
        }
        answer = new int[size];
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(4);
        int[] solution2 = sol.solution(5);
        int[] solution3 = sol.solution(6);

        for (int s1 : solution1) {
            System.out.println("s1 = " + s1);
        }

        System.out.println("======================");

        for (int s2 : solution2) {
            System.out.println("s2 = " + s2);
        }

        System.out.println("======================");

        for (int s3 : solution3) {
            System.out.println("s3 = " + s3);
        }
    }
}
