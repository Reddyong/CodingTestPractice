package org.example.롤케이크자르기;

import java.util.*;

public class ex {
    Set<Integer> set1 = new HashSet<>();
    Map<Integer, Integer> set2 = new HashMap<>();
    int answer = 0;

    public int solution(int[] topping) {
        int size = topping.length;

        init(topping, size);
        checkAns(topping, size);

        return answer;
    }

    public void init(int[] topping, int size) {
        set1.add(topping[0]);
        for (int i = 1; i < size; i++) {
            set2.put(topping[i], set2.getOrDefault(topping[i], 0) + 1);
        }
    }

    public void checkAns(int[] topping, int size) {
        for (int j = 1; j < size; j++) {
            set1.add(topping[j]);
            set2.put(topping[j], set2.get(topping[j]) - 1);

            if (set2.get(topping[j]) == 0) {
                set2.remove(topping[j]);
            }

            if (set1.size() == set2.keySet().size()) {
                answer++;
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2});
//        int solution2 = sol.solution(new int[]{1, 2, 3, 1, 4});

        System.out.println("solution1 = " + solution1);
//        System.out.println("solution2 = " + solution2);
    }
}
