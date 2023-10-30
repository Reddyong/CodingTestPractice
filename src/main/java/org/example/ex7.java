package org.example;

import java.util.Arrays;

public class ex7 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int index = 0;

        Arrays.sort(people);

        for (int i = people.length - 1; i >= index; i--) {
            if ((people[i] + people[index]) <= limit) {
                index++;
                answer++;
            } else {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        ex7 sol = new ex7();
        int solution = sol.solution(new int[]{70, 50, 80, 50}, 100);
        System.out.println("solution = " + solution);
    }
}
