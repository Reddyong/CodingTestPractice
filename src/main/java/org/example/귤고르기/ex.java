package org.example.귤고르기;

import java.util.*;

public class ex {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer key : tangerine) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());

        int count =  0;
        for (Integer integer : list) {
            answer++;
            count += integer;
            if (count >= k) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        int solution2 = sol.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        int solution3 = sol.solution(4, new int[]{1, 1, 1, 1, 2, 2, 2, 3});
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
