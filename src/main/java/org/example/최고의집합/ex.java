package org.example.최고의집합;

import java.util.Arrays;
import java.util.Comparator;

public class ex {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];

        if(s < n){
            answer = new int[]{-1};
        }
        else{
            solve(n, s, answer);
        }

        Arrays.sort(answer);

        return answer;
    }

    public void solve(int n, int s, int[] answer){
        int q = s / n;
        int sum = s;
        for(int i = 0; i < n; i++){
            answer[i] = q;
            sum -= q;
        }

        int nSum = sum;
        for(int j = 0; j < nSum; j++){
            answer[j]++;
            sum--;
            if(sum == 0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(2, 9);
        int[] solution2 = sol.solution(2, 1);
        int[] solution3 = sol.solution(2, 8);

        for (int i : solution1) {
            System.out.println("i = " + i);
        }
        for (int i : solution2) {
            System.out.println("i = " + i);
        }
        for (int i : solution3) {
            System.out.println("i = " + i);
        }
    }
}
