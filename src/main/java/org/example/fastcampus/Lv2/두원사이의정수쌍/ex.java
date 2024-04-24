package org.example.fastcampus.Lv2.두원사이의정수쌍;

public class ex {
    public long solution(int r1, int r2) {
        long answer = 0;

        answer = getTotalPair(r1, r2);

        return answer;
    }

    private long getTotalPair(int r1, int r2) {
        long temp = 0;
        long l1 = 0;
        long l2 = 0;

        for (int i = 0; i <= r2; i++) {
            if (i == 0) {
                temp += (r2 - r1 + 1);
                continue;
            }

            l1 = getCurLength(r1, i);
            l2 = getCurLength(r2, i);

            if (i >= r1) {
                temp += l2;
                continue;
            }

            if (Math.sqrt(Math.pow(r1, 2) - Math.pow(i, 2)) % 1 == 0) {
                temp++;
            }

            temp += (l2 - l1);
        }

        return temp * 4;
    }

    private long getCurLength(int r, int x) {
        return (long) Math.sqrt((long) Math.pow(r, 2) - (long) Math.pow(x, 2));
    }

    public static void main(String[] args) {
        ex sol = new ex();
        long solution = sol.solution(2, 3);

        System.out.println("solution = " + solution);
    }
}
