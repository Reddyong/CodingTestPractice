package org.example.두큐합같게만들기;

import java.util.LinkedList;
import java.util.Queue;

public class ex {
    long sum1 = 0;
    long sum2 = 0;
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        int count = 0;

        init(queue1, queue2);

        while (sum1 != sum2) {
            if (count >= (queue1.length + queue2.length) * 2) {
                answer = -1;
                break;
            }

            answer = whereIsBigSum(answer);
            count++;
        }

        return answer;
    }

    public int whereIsBigSum(int answer) {
        if (sum1 > sum2) {
            Integer poll = q1.poll();
            q2.add(poll);
            sum1 -= poll;
            sum2 += poll;
        } else {
            Integer poll = q2.poll();
            q1.add(poll);
            sum2 -= poll;
            sum1 += poll;
        }
        answer++;
        return answer;
    }

    public void init(int[] queue1, int[] queue2) {
        for (int i : queue1) {
            q1.add(i);
            sum1 += i;
        }
        for (int i : queue2) {
            q2.add(i);
            sum2 += i;
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
//        int solution1 = sol.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1});
        int solution2 = sol.solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2});
//        int solution3 = sol.solution(new int[]{1, 1}, new int[]{1, 5});

//        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
//        System.out.println("solution3 = " + solution3);
    }
}
