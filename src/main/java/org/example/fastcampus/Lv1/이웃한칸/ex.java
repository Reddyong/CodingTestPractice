package org.example.fastcampus.Lv1.이웃한칸;

public class ex {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new String[][]{{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}}, 1, 1);
        int solution2 = sol.solution(new String[][]{{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}}, 0, 1);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
