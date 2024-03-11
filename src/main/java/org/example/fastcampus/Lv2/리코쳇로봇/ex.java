package org.example.fastcampus.Lv2.리코쳇로봇;

public class ex {
    public int solution(String[] board) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."});
        int solution2 = sol.solution(new String[]{".D.R", "....", ".G..", "...D"});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
