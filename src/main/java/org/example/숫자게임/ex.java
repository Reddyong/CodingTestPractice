package org.example.숫자게임;

import java.util.*;

public class ex {
    int size;
    public int solution(int[] A, int[] B) {
        int answer = 0;
        size = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        int b = size - 1;
        for (int a = size - 1; a>= 0; a--) {
            if (A[a] < B[b]) {
                answer++;
                b--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{5, 1, 3, 7}, new int[]{2, 2, 6, 8});
        int solution2 = sol.solution(new int[]{2, 2, 2, 2}, new int[]{1, 1, 1, 1});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
