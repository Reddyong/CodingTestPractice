package org.example.연속부분수열합의개수;

import java.util.HashSet;
import java.util.Set;

public class ex {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i < elements.length + 1; i++) {
            solve(set, elements, i);
        }

        answer = set.size();
        return answer;
    }

    public void solve(Set<Integer> set, int[] elements, int count) {
        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = i; j < i + count; j++) {
                if (j >= elements.length) {
                    sum += elements[j - (elements.length)];
                } else {
                    sum += elements[j];
                }
            }
            set.add(sum);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(new int[]{7, 9, 1, 1, 4});
        System.out.println("solution = " + solution);
    }
}
