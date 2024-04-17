package org.example.fastcampus.Lv2.프로세스;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ex {
    PriorityQueue<Integer> pq;
    public int solution(int[] priorities, int location) {
        int answer = 0;

        initQueue(priorities);
        answer = getPriority(priorities, location);

        return answer;
    }

    private int getPriority(int[] priorities, int location) {
        int ans = 0;
        int count = 0;

        while (count < priorities.length) {
            Integer peek = pq.peek();

            if (peek == priorities[count]) {
                ans++;
                pq.poll();
                if (count == location) {
                    break;
                }
            }

            count++;

            if (count == priorities.length) {
                count = 0;
            }
        }

        return ans;
    }

    private void initQueue(int[] priorities) {
        pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int priority : priorities) {
            pq.add(priority);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{2, 1, 3, 2}, 2);
        int solution2 = sol.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
