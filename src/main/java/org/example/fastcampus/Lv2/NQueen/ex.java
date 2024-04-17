package org.example.fastcampus.Lv2.NQueen;

public class ex {
    int[] queen;
    int answer;
    public int solution(int n) {

        init(n);
        getQueen(0);

        return answer;
    }

    private void getQueen(int depth) {
        if (depth == queen.length) {
            answer++;
            return;
        }

        for (int i = 0; i < queen.length; i++) {
            queen[depth] = i;

            if (isCorrect(depth)) {
                getQueen(depth + 1);
            }
        }
    }

    private boolean isCorrect(int depth) {
        for (int i = 0; i < depth; i++) {
            if (queen[depth] == queen[i]) {
                return false;
            }

            if (Math.abs(depth - i) == Math.abs(queen[depth] - queen[i])) {
                return false;
            }
        }

        return true;
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
