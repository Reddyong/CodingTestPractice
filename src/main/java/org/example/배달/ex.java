package org.example.배달;

import java.util.Arrays;
import java.util.PriorityQueue;

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
        int[][] edge = getEdge(road, N);

        answer = getAnswer(costArr, edge, N, K);

        return answer;
    }

    private int getAnswer(int[] costArr, int[][] edge, int N, int K) {
        costArr = dijkstra(costArr, edge, N);
        int result = 0;

        for (int i = 1; i <= N; i++) {
            if (costArr[i] <= K) {
                result++;
            }
        }

        return result;
    }

    private int[] dijkstra(int[] costArr, int[][] edge, int N) {
        PriorityQueue<Road> roadQ = new PriorityQueue<>();
        roadQ.offer(new Road(1, 0));

        while (!roadQ.isEmpty()) {
            Road route = roadQ.poll();

            for (int i = 1; i <= N; i++) {
                if (edge[route.city][i] != MAX) {
                    if (costArr[i] > costArr[route.city] + edge[route.city][i]) {
                        costArr[i] = costArr[route.city] + edge[route.city][i];

                        roadQ.offer(new Road(i, costArr[i]));
                    }
                }
            }
        }

        return costArr;
    }

    private int[][] getEdge(int[][] road, int N) {
        int[][] result = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            Arrays.fill(result[i], MAX);
        }

        for (int[] r : road) {
            int cost = Math.min(result[r[0]][r[1]], r[2]);

            result[r[0]][r[1]] = cost;
            result[r[1]][r[0]] = cost;
        }

        return result;
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
