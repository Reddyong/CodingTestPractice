package org.example.fastcampus.Lv1.기사단원의무기;

import java.util.Arrays;

public class ex {
    int[] numOfDiv;
    public int solution(int number, int limit, int power) {
        int answer = 0;

        initArr(number);


        return answer;
    }

    private void initArr(int number) {
        numOfDiv = new int[number];

        for (int i = 0; i < numOfDiv.length; i++) {
            int cur = i + 1;
            numOfDiv[i] = getDivisors(cur);
        }
    }

    private int getDivisors(int cur) {
        int num = (int) Math.sqrt(cur);
        int cnt = 0;

        for (int i = 1; i <= num; i++) {
            if (cur % i == 0) {
                cnt++;
            }
        }

        if (num * num == cur) {
            return cnt * 2 - 1;
        }

        return cnt * 2;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(5, 3, 2);
        int solution2 = sol.solution(10, 3, 2);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
