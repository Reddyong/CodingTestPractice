package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ex5 {
    public int solution(int[] A, int[] B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - i - 1];
        }
        return answer;
    }
    public static void main(String[] args) {
        ex5 sol = new ex5();
        int answer = sol.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});
        System.out.println("answer = " + answer);
    }
}
