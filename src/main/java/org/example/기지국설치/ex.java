package org.example.기지국설치;

public class ex {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        boolean[] check = new boolean[n];

        init(stations, check);

        isStationsTrue(n, stations, w, check);

        return answer;
    }

    private static void isStationsTrue(int n, int[] stations, int w, boolean[] check) {
        for (int station : stations) {
            int location = station - 1;
            if (location - w > 0) {
                for (int i = location - w; i < location; i++) {
                    check[i] = true;
                }
            }
            if (location + w < n) {
                for (int j = location + 1; j < location + 1 + w; j++) {
                    check[j] = true;
                }
            }
        }
    }

    private static void init(int[] stations, boolean[] check) {
        for (int station : stations) {
            check[station - 1] = true;
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(11, new int[]{4, 11}, 1);
        int solution2 = sol.solution(16, new int[]{9}, 2);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
