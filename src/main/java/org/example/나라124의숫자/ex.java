package org.example.나라124의숫자;

import java.util.ArrayList;
import java.util.List;

public class ex {
    public String solution(int n) {
        String answer = "";
        List<Integer> list = new ArrayList<>();

        while (n != 0) {
            int num = n % 3;
            if (num == 0) {
                num = 4;
                list.add(num);
                n = n / 3 - 1;
                continue;
            }
            list.add(num);
            n /= 3;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            answer += list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution(1);
        String solution2 = sol.solution(2);
        String solution3 = sol.solution(3);
        String solution4 = sol.solution(6);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
        System.out.println("solution4 = " + solution4);
    }
}
