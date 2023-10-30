package org.example;

import java.util.ArrayList;

public class ex15 {
    public int solution(int n, int a, int b) {
        int answer = 0;
        int aIndex = a - 1;
        int bIndex = b - 1;

        answer = solve(aIndex, bIndex, 0);

        return answer;
    }

    public int solve(int aIndex, int bIndex, int answer){
        if((aIndex / 2) != (bIndex / 2)){
            return solve(aIndex/2, bIndex/2, answer + 1);
        }
        else{
            answer++;
            return answer;
        }
    }

    public static void main(String[] args) {
        ex15 sol = new ex15();
        int solution = sol.solution(8, 4, 7);
        System.out.println("solution = " + solution);
    }
}
