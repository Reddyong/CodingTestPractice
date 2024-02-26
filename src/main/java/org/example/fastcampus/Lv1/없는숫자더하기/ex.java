package org.example.fastcampus.Lv1.없는숫자더하기;

import java.util.HashSet;
import java.util.Set;

public class ex {
    Set<Integer> set = new HashSet<>(Set.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    public int solution(int[] numbers) {
        int answer = -1;

        answer = getPlusNum(numbers);
        return answer;
    }

    private int getPlusNum(int[] numbers) {
        int ans = 0;

        for (int number : numbers) {
            if (set.contains(number)) {
                set.remove(number);
            }
        }

        for (Integer integer : set) {
            ans += integer;
        }

        return ans;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});
        int solution2 = sol.solution(new int[]{5, 8, 4, 0, 6, 7, 9});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
