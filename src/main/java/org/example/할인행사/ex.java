package org.example.할인행사;

import java.util.HashMap;
import java.util.Map;

public class ex {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> check = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
            check.put(want[i], 0);
        }

        for (int j = 0; j <= discount.length - 10; j++) {
            solve(j, discount, map);
            if (map.equals(check)) {
                answer++;
            }
            for (int h = 0; h < want.length; h++) {
                map.put(want[h], number[h]);
            }
        }

        return answer;
    }

    public void solve(int j, String[] discount, Map<String, Integer> map) {
        for (int k = j; k < j + 10; k++) {
            if (!map.containsKey(discount[k]) || map.get(discount[k]) <= 0) {
                return;
            }
            map.put(discount[k], map.get(discount[k]) - 1);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, new int[]{3, 2, 2, 2, 1}, new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"});
        int solution2 = sol.solution(new String[]{"apple"}, new int[]{10}, new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"});
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
