package org.example;

public class ex16 {
    public int solution(int[] arr) {  // 2 6 8 24
        int answer = 0;

        int gNum = sol(arr[0], arr[1]);
        answer = (arr[0] * arr[1]) / gNum;

        for (int i = 2; i < arr.length; i++) {
            int g = sol(answer, arr[i]);
            answer = (answer * arr[i]) / g;
        }

        return answer;
    }

    public int sol(int a, int b) { // 유클리드 호제법
        int r = a % b;
        if (r == 0) {
            return b;
        } else {
            return sol(b, r);
        }
    }
    public static void main(String[] args) {
        ex16 sol = new ex16();
        int solution = sol.solution(new int[]{2, 6, 8, 14});
        System.out.println("solution = " + solution);
    }


}
