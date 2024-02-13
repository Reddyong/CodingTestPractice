package org.example.fastcampus.덧칠하기;

public class ex {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        int end = section[0] + m - 1;

        for (int s : section) {
            if (s >= start && s <= end) {
                continue;
            }
            start = s;
            end = start + m - 1;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(8, 4, new int[]{2, 3, 6});
        int solution2 = sol.solution(5, 4, new int[]{1, 3});
        int solution3 = sol.solution(4, 1, new int[]{1, 2, 3, 4});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
