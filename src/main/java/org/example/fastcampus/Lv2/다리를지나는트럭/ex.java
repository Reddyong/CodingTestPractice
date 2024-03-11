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
        getCrossTime(truck_weights, bridge_length, weight);
        return answer;
    }

    private void getCrossTime(int[] truckWeights, int bridgeLength, int weight) {
        for (int truckWeight : truckWeights) {
            while (true) {
                if (onTheBridge.isEmpty()) {
                    onTheBridge.add(truckWeight);
                    totalWeight += truckWeight;
                    time++;
                    break;
                }

                if (onTheBridge.size() != bridgeLength && !isWeightOver(truckWeight, weight)) {
                    onTheBridge.add(truckWeight);
                    totalWeight += truckWeight;
                    time++;
                    break;
                }

                if (onTheBridge.size() != bridgeLength && isWeightOver(truckWeight, weight)) {
                    onTheBridge.add(0);
                    time++;
                    continue;
                }

                if (onTheBridge.size() == bridgeLength) {
                    Integer poll = onTheBridge.poll();
                    totalWeight -= poll;
                }
            }
        }

        answer = time + bridgeLength;
    }

    private boolean isWeightOver(int truckWeight, int weight) {
        if (totalWeight + truckWeight > weight) {
            return true;
        }
        return false;
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
