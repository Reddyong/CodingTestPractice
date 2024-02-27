package org.example.fastcampus.Lv1.두개뽑아서더하기;

import java.util.*;

public class ex {
    List<Integer> list = new ArrayList<>();
    public int[] solution(int[] numbers) {
        int[] answer = {};

        saveSumToList(numbers);
        answer = listToArr();

        return answer;
    }

    private int[] listToArr() {
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        Arrays.sort(ans);

        return ans;
    }

    private void saveSumToList(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];

                if (!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new int[]{2, 1, 3, 4, 1});
        int[] solution2 = sol.solution(new int[]{5, 0, 2, 7});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
