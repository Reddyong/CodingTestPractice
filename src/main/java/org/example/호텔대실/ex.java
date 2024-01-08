package org.example.호텔대실;

import java.util.Arrays;
import java.util.Comparator;

public class ex {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[][] times = new int[book_time.length][2];

        timesToNum(book_time, times);


        for (int[] time : times) {
            System.out.println("time = " + Arrays.toString(time));
        }

        System.out.println("============================");

        return answer;
    }

    private static void timesToNum(String[][] book_time, int[][] times) {
        for (int i = 0; i < book_time.length; i++) {
            String[] start = book_time[i][0].split(":");
            String[] end = book_time[i][1].split(":");
            times[i][0] = Integer.parseInt(start[0]) * 60 + Integer.parseInt(start[1]);
            times[i][1] = Integer.parseInt(end[0]) * 60 + Integer.parseInt(end[1]);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}});
        int solution2 = sol.solution(new String[][]{{"09:10", "10:10"}, {"10:20", "12:20"}});
        int solution3 = sol.solution(new String[][]{{"10:20", "12:30"}, {"10:20", "12:30"}, {"10:20", "12:30"}});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
