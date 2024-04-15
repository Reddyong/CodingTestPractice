package org.example.fastcampus.Lv2.구명보트;

import java.util.Arrays;
import java.util.Comparator;

public class ex {
    public int solution(int[] people, int limit) {
        int answer = 0;

        answer = getTotalBoat(people, limit);

        return answer;
    }

    private int getTotalBoat(int[] people, int limit) {
        Arrays.sort(people);
        int idx = 0;
        int ans = 0;

        for (int i = people.length - 1; i >= idx; i--) {
            if (people[i] + people[idx] <= limit) {
                ans++;
                idx++;
                continue;
            }

            ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{70, 50, 80, 50}, 100);
        int solution2 = sol.solution(new int[]{70, 80, 50}, 100);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
