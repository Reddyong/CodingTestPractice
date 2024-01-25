package org.example.줄서는방법;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex {
    int count = 0;
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();
        long cases = factorial(n);

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        k--;

        while (count < n) {
            cases /= (n - count);
            answer[count++] = list.remove((int) (k / cases));
            k %= cases;
        }

        return answer;
    }

    private long factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution = sol.solution(3, 5);

        System.out.println("solution = " + Arrays.toString(solution));
    }
}
