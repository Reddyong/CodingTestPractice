package org.example.fastcampus.Lv2.리코쳇로봇;

public class ex {
    int curRx;
    int curRy;
    int goalX;
    int goalY;
    boolean[][] visited;
    int[] dx = new int[]{1, 0, -1, 0};
    int[] dy = new int[]{0, 1, 0, -1};
    public int solution(String[] board) {
        int answer = 0;

        initCurAndGoal(board);

        return answer;
    }

    private void initCurAndGoal(String[] board) {
        visited = new boolean[board.length][board[0].length()];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                char cur = board[i].charAt(j);

                if (cur == 'R') {
                    curRx = j;
                    curRy = i;
                }

                if (cur == 'G') {
                    goalX = j;
                    goalY = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."});
        int solution2 = sol.solution(new String[]{".D.R", "....", ".G..", "...D"});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
