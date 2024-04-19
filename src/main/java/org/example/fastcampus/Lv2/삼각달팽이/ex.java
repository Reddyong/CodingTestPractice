package org.example.fastcampus.Lv2.삼각달팽이;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex {
    List<Integer> list = new ArrayList<>();
    int[][] triangle;
    int dir = 0;
    int r = 0;
    int c = 0;
    public int[] solution(int n) {
        int[] answer = {};
        triangle = new int[n][n];

        answer = getResult(n);

        return answer;
    }

    private int[] getResult(int n) {
        int count = 1;

        while (count <= n * (n + 1) / 2) {
            triangle[r][c] = count;

            int flag = dir % 3;

            updateLocation(flag, n);

            count++;
        }

        for (int[] tr : triangle) {
            for (int t : tr) {
                if (t != 0) {
                    list.add(t);
                }
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    private void updateLocation(int flag, int n) {
        if (flag == 0) {
            if (r + 1 >= n || triangle[r + 1][c] != 0) {
                dir++;
                c++;
            } else {
                r++;
            }
        } else if (flag == 1) {
            if (c + 1 >= n || triangle[r][c + 1] != 0) {
                dir++;
                r--;
                c--;
            } else {
                c++;
            }
        } else {
            if (triangle[r - 1][c - 1] != 0) {
                dir++;
                r++;
            } else {
                r--;
                c--;
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(4);
        int[] solution2 = sol.solution(5);
        int[] solution3 = sol.solution(6);

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
    }
}
