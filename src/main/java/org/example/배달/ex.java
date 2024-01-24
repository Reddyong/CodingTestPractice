package org.example.배달;

import java.util.Arrays;

public class ex {
    final int MAX = 500001;

    class Road implements Comparable<Road> {
        int city;
        int cost;

        public Road(int city, int cost) {
            this.city = city;
            this.cost = cost;
        }

        @Override
        public int compareTo(Road o) {
            return this.cost > o.cost ? 1 : -1;
        }
    }
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        int[] costArr = initArr(N);

        return answer;
    }

    private int[] initArr(int N) {
        int[] result = new int[N + 1];
        Arrays.fill(result, MAX);
        result[1] = 0;

        return result;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(5, new int[][]{{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}}, 3);
        int solution2 = sol.solution(6, new int[][]{{1, 2, 1}, {1, 3, 2}, {2, 3, 2}, {3, 4, 3}, {3, 5, 2}, {3, 5, 3}, {5, 6, 1}}, 4);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
