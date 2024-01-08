package org.example.호텔대실;

public class ex {
    public int solution(String[][] book_time) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"16:40", "18:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}});
        int solution2 = sol.solution(new String[][]{{"09:10", "10:10"}, {"10:20", "12:20"}});
        int solution3 = sol.solution(new String[][]{{"10:20", "12:30"}, {"10:20", "12:30"}, {"10:20", "12:30"}});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
