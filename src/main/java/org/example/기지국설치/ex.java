package org.example.기지국설치;

public class ex {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int now = 1;
        int stationIndex = 0;

        while (now <= n) {
            if (stationIndex >= stations.length || now < stations[stationIndex] - w) {
                answer++;
                now = now + 2 * w + 1;
            } else {
                now = stations[stationIndex] + w + 1;
                stationIndex++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(11, new int[]{4, 11}, 1);
        int solution2 = sol.solution(16, new int[]{9}, 2);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
