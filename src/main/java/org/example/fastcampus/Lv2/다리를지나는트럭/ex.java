package org.example.fastcampus.Lv2.다리를지나는트럭;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ex {
    int totalWeight;
    int time;
    int answer;
    Queue<Integer> onTheBridge;
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        init();

        return answer;
    }

    private void init() {
        totalWeight = 0;
        time = 0;
        answer = 0;
        onTheBridge = new LinkedList<>();
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(2, 10, new int[]{7, 4, 5, 6});
        int solution2 = sol.solution(100, 100, new int[]{10});
        int solution3 = sol.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
