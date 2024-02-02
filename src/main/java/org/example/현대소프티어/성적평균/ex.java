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
        getAvg();
        showAnswer();
    }

    private static void showAnswer() {
        for (double result : results) {
            System.out.printf("%.2f", result);
            System.out.println();
        }
    }

    private static void getAvg() {
        for (int i = 0; i < K; i++) {
            int startIdx = ranges[i][0] - 1;
            int endIdx = ranges[i][1] - 1;

            double avg = getAnswer(startIdx, endIdx);

            results[i] = avg;
        }
    }

    private static double getAnswer(int startIdx, int endIdx) {

        double num = 0;
        double count = endIdx - startIdx + 1;

        for (int i = startIdx; i <= endIdx; i++) {
            num += scores[i];
        }

        num /= count;

        return num;
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
