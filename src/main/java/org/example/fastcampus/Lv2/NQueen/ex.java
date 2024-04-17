package org.example.fastcampus.Lv2.NQueen;

public class ex {
    int[] queen;
    int answer;
    public int solution(int n) {

        init(n);

        return answer;
    }

    private void init(int n) {
        queen = new int[n];
        answer = 0;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(4);

        System.out.println("solution = " + solution);
    }
}
