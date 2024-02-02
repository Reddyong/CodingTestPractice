package org.example.현대소프티어.성적평균;

import java.util.Arrays;
import java.util.Scanner;

public class ex {
    static int N;
    static int K;
    static int[] scores;
    static int[][] ranges;
    static double[] results;
    public static void main(String[] args) {

        init();
    }

    private static void init() {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        K = scanner.nextInt();

        scores = new int[N];
        ranges = new int[K][2];
        results = new double[K];

        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }
        for (int j = 0; j < K; j++) {
            ranges[j][0] = scanner.nextInt();
            ranges[j][1] = scanner.nextInt();
        }
    }
}
