package org.example.시소짝꿍;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ex {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Double, Integer> map = new HashMap<>();
        Arrays.sort(weights);

        for (int w : weights) {
            double a = w * 1.0;
            double b = (w * 2.0) / 3.0;
            double c = (w * 2.0) / 4.0;
            double d = (w * 3.0) / 4.0;

            if (map.containsKey(a)) {
                answer += map.get(a);
            }
            if (map.containsKey(b)) {
                answer += map.get(b);
            }
            if (map.containsKey(c)) {
                answer += map.get(c);
            }
            if (map.containsKey(d)) {
                answer += map.get(d);
            }

            map.put(w * 1.0, map.getOrDefault(w * 1.0, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        long solution = sol.solution(new int[]{100, 180, 360, 100, 270});

        System.out.println("solution = " + solution);
    }
}
