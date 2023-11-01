package org.example.택배상자;

import java.util.*;

public class ex {
    int[] realBelt;
    Stack<Integer> subBelt = new Stack<>();
    public int solution(int[] order) {
        int answer = 0;
        int target = 1;
        realBelt = new int[order.length];

        changeToRealBelt(order);

        target = getTargetNum(target);

        answer = target - 1;

        return answer;
    }

    public int getTargetNum(int target) {
        for (int i = 0; i < realBelt.length; i++) {
            if (realBelt[i] == target) {
                target++;
            } else {
                subBelt.push(realBelt[i]);
            }

            while (!subBelt.isEmpty() && subBelt.peek() == target) {
                target++;
                subBelt.pop();
            }
        }
        return target;
    }

    public void changeToRealBelt(int[] order) {
        for (int i = 0; i < order.length; i++) {
            realBelt[order[i] - 1] = i + 1;
        }
    }


    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{4, 3, 1, 2, 5});
//        int solution2 = sol.solution(new int[]{5, 4, 3, 2, 1});
//        int solution3 = sol.solution(new int[]{3, 5, 4, 2, 1});

        System.out.println("solution1 = " + solution1);
//        System.out.println("solution2 = " + solution2);
//        System.out.println("solution3 = " + solution3);
    }
}
