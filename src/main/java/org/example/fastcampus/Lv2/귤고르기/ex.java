package org.example.fastcampus.Lv2.귤고르기;

import java.util.*;

public class ex {
    Map<Integer, Integer> map;
    List<Integer> tangerines;
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        initTangerines(tangerine);

        return answer;
    }

    private void initTangerines(int[] tangerine) {
        map = new HashMap<>();

        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        tangerines = new ArrayList<>(map.values());

        Collections.sort(tangerines, Comparator.reverseOrder());
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        int solution2 = sol.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        int solution3 = sol.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
