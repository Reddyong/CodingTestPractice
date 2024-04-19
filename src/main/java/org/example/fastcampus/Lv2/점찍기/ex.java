package org.example.fastcampus.Lv2.점찍기;

public class ex {
    public long solution(int k, int d) {
        long answer = 0;

        answer = getResult(k, d);

        return answer;
    }

    private long getResult(int k, int d) {
        long ans = 0;

        for (int i = 0; i <= d; i += k) {
            long maxY = getMaxY(i, d);
            ans += maxY / k;
            ans++;
        }

        return ans;
    }

    private long getMaxY(int i, int d) {
        return (long) Math.sqrt(Math.pow(d, 2) - Math.pow(i, 2));
    }

    public static void main(String[] args) {
        ex sol = new ex();
        long solution1 = sol.solution(2, 4);
        long solution2 = sol.solution(1, 5);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
