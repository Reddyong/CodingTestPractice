package org.example.쿼드압축후개수세기;

import java.util.Arrays;

public class ex {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        int n = arr.length;

        answer = dAndC(arr, answer, n);

        return answer;
    }

    public int[] dAndC(int[][] arr, int[] answer, int n) {
        if (n == 1) {
            return getLastStep(arr, answer);
        }

        if (isAllOne(arr)) {
            answer[1]++;
            return answer;
        }
        if (isAllZero(arr)) {
            answer[0]++;
            return answer;
        }

        int[][] newArr1 = new int[n / 2][n / 2];
        int[][] newArr2 = new int[n / 2][n / 2];
        int[][] newArr3 = new int[n / 2][n / 2];
        int[][] newArr4 = new int[n / 2][n / 2];

        fillNewArrays(arr, n, newArr1, newArr2, newArr3, newArr4);

        dAndC(newArr1, answer, n / 2);
        dAndC(newArr2, answer, n / 2);
        dAndC(newArr3, answer, n / 2);
        dAndC(newArr4, answer, n / 2);

        return answer;
    }

    private static void fillNewArrays(int[][] arr, int n, int[][] newArr1, int[][] newArr2, int[][] newArr3, int[][] newArr4) {
        for (int j = 0; j < n / 2; j++) {
            for (int k = 0; k < n; k++) {
                if (k < n / 2) {
                    newArr1[j][k] = arr[j][k];
                    continue;
                }
                newArr2[j][k - n / 2] = arr[j][k];
            }
        }

        for (int j = n / 2; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (k < n / 2) {
                    newArr3[j - n / 2][k] = arr[j][k];
                    continue;
                }
                newArr4[j - n / 2][k - n / 2] = arr[j][k];
            }
        }
    }

    public boolean isAllOne(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt != 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isAllZero(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[] getLastStep(int[][] arr, int[] answer) {
        if (arr[0][0] == 0) {
            answer[0]++;
        } else {
            answer[1]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}});
        int[] solution2 = sol.solution(new int[][]{{1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 1, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0, 0, 1}, {0, 0, 0, 0, 1, 1, 1, 1}});

        for (int i : solution1) {
            System.out.println("i1 = " + i);
        }
        for (int i : solution2) {
            System.out.println("i2 = " + i);
        }
    }
}
