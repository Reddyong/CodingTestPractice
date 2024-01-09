package org.example.전력망을둘로나누기;

public class ex {
    public int solution(int n, int[][] wires) {
        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}});
        int solution2 = sol.solution(4, new int[][]{{1, 2}, {2, 3}, {3, 4}});
        int solution3 = sol.solution(7, new int[][]{{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
