package org.example.택배상자;

import java.util.Stack;

public class ex {
    int[] realBelt;
    public int solution(int[] order) {
        int answer = 0;
        realBelt = new int[order.length];
        Stack<Integer> subBelt = new Stack<>();

        changeToReal(order);


        return answer;
    }

    public void changeToReal(int[] order) {
        for (int i = 0; i < order.length; i++) {
            int index = order[i] - 1;
            realBelt[index] = i + 1;
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{4, 3, 1, 2, 5});
//        int solution2 = sol.solution(new int[]{5, 4, 3, 2, 1});

        System.out.println("solution1 = " + solution1);
//        System.out.println("solution2 = " + solution2);
    }
}
