package org.example.숫자변환하기;

import java.util.LinkedList;
import java.util.Queue;

public class exQueue {
    class Pair{
        int cur;
        int cnt;

        Pair(int cur, int cnt){
            this.cur = cur;
            this.cnt = cnt;
        }
    }
    public int solution(int x, int y, int n) {
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(y, 0));

        while(!q.isEmpty()){
            Pair p = q.poll();

            int cur = p.cur;
            int cnt = p.cnt;

            if(cur < x){
                continue;
            }

            if(cur == x){
                return cnt;
            }

            if(cur % 2 == 0){
                q.add(new Pair(cur / 2, cnt + 1));
            }
            if(cur % 3 == 0){
                q.add(new Pair(cur / 3, cnt + 1));
            }

            q.add(new Pair(cur - n, cnt + 1));
        }

        return -1;
    }

    public static void main(String[] args) {
        exQueue sol = new exQueue();
        int solution1 = sol.solution(10, 40, 5);
        int solution2 = sol.solution(10, 40, 30);
        int solution3 = sol.solution(2, 5, 4);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
