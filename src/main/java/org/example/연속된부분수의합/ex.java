package org.example.연속된부분수의합;

import java.util.Arrays;
import java.util.Iterator;

public class ex {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int seqLength = sequence.length;
        int[][] check = new int[seqLength][2];
        int startIdx = 0;
        int endIdx = 0;

        saveIndex(sequence, k, seqLength, check);

        for (int[] ints : check) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("=============");

        return answer;
    }

    public static void saveIndex(int[] sequence, int k, int seqLength, int[][] check) {
        int startIdx;
        int endIdx;
        for (int i = 0; i < seqLength; i++) {
            int sum = 0;
            for (int j = i; j < seqLength; j++) {
                startIdx = i;
                endIdx = j;
                sum += sequence[j];
                if (sum == k) {
                    sum = 0;
                    check[startIdx][0] = startIdx;
                    check[startIdx][1] = endIdx;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new int[]{1, 2, 3, 4, 5}, 7);
        int[] solution2 = sol.solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5);
        int[] solution3 = sol.solution(new int[]{2, 2, 2, 2, 2}, 6);

        for (int s1 : solution1) {
            System.out.println("s1 = " + s1);
        }

        for (int s2 : solution2) {
            System.out.println("s2 = " + s2);
        }

        for (int s3 : solution3) {
            System.out.println("s3 = " + s3);
        }
    }
}
