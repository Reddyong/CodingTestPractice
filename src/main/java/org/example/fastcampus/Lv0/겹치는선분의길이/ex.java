package org.example.fastcampus.Lv0.겹치는선분의길이;

public class ex {
    public int solution(int[][] lines) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[][]{{0, 1}, {2, 5}, {3, 9}});
        int solution2 = sol.solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}});
        int solution3 = sol.solution(new int[][]{{0, 5}, {3, 9}, {1, 10}});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
