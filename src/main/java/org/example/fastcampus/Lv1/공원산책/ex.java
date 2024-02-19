package org.example.fastcampus.Lv1.공원산책;

import java.util.Arrays;

public class ex {
    String[][] map;
    int[] cur;
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        init(park);
        routing(routes);
        answer = getAnswer(answer);
        return answer;
    }

    private int[] getAnswer(int[] answer) {
        answer[0] = cur[0];
        answer[1] = cur[1];

        return answer;
    }

    private void routing(String[] routes) {
        for (String route : routes) {
            String[] split = route.split(" ");
            String direction = split[0];
            int distance = Integer.parseInt(split[1]);
            moveDog(direction, distance);
        }
    }

    private void moveDog(String direction, int distance) {
        int curX = cur[0];
        int curY = cur[1];
        boolean check = true;

        if (direction.equals("E")) {
            for (int i = 1; i <= distance; i++) {
                curY++;
                if (curY >= map[0].length || map[curX][curY].equals("X")) {
                    check = false;
                    break;
                }
            }

            if (check) {
                cur[1] = curY;
            }
        } else if (direction.equals("W")) {
            for (int i = 1; i <= distance; i++) {
                curY--;
                if (curY < 0 || map[curX][curY].equals("X")) {
                    check = false;
                    break;
                }
            }

            if (check) {
                cur[1] = curY;
            }
        } else if (direction.equals("S")) {
            for (int i = 1; i <= distance; i++) {
                curX++;
                if (curX >= map.length || map[curX][curY].equals("X")) {
                    check = false;
                    break;
                }
            }

            if (check) {
                cur[0] = curX;
            }
        } else {
            for (int i = 1; i <= distance; i++) {
                curX--;
                if (curX < 0 || map[curX][curY].equals("X")) {
                    check = false;
                    break;
                }
            }

            if (check) {
                cur[0] = curX;
            }
        }
    }

    private void init(String[] park) {
        map = new String[park.length][park[0].length()];
        cur = new int[2];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                map[i][j] = park[i].substring(j, j + 1);
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals("S")) {
                    cur[0] = i;
                    cur[1] = j;
                    return;
                }
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
