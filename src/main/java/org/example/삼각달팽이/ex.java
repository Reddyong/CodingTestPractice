package org.example.삼각달팽이;

public class ex {
    public int[] solution(int n) {
        int[] answer = init(n);
        return answer;
    }

    private static int[] init(int n) {
        int[] answer;
        int size = 0;
        for (int i = 1; i <= n; i++) {
            size += i;
        }
        answer = new int[size];
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(4);
        int[] solution2 = sol.solution(5);
        int[] solution3 = sol.solution(6);
    }
}
