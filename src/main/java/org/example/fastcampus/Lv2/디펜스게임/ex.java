package org.example.fastcampus.Lv2.디펜스게임;


import java.util.PriorityQueue;
import java.util.Queue;

public class ex {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;

        answer = playDefense(enemy, n, k);

        return answer;
    }

    private int playDefense(int[] enemy, int n, int k) {
        int ans = 0;
        Queue<Integer> pq = new PriorityQueue<>();

        for (int e : enemy) {
            n -= e;
            pq.add(e);

            if (n < 0) {
                if (k <= 0) {
                    break;
                }
                n += pq.poll();
                k--;
            }
            ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(7, 3, new int[]{4, 2, 4, 5, 3, 3, 1});
        int solution2 = sol.solution(2, 4, new int[]{3, 3, 3, 3});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
