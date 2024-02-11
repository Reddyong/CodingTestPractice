package org.example.fastcampus.공원산책;

import java.util.Arrays;

public class ex {
    String[][] map;
    int[] cur;
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        init(park);

        return answer;
    }

    private void init(String[] park) {
        map = new String[park.length][park[0].length()];
        cur = new int[2];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                map[i][j] = park[i].substring(j, j + 1);
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new String[]{"SOO", "OOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"});
        int[] solution2 = sol.solution(new String[]{"SOO", "OXX", "OOO"}, new String[]{"E 2", "S 2", "W 1"});
        int[] solution3 = sol.solution(new String[]{"OSO", "OOO", "OXO", "OOO"}, new String[]{"E 2", "S 3", "W 1"});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));

    }
}
