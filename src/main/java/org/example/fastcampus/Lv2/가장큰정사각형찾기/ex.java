package org.example.fastcampus.Lv2.가장큰정사각형찾기;

public class ex {
    public int solution(int[][] board){
        int answer = 1234;

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}});
        int solution2 = sol.solution(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
