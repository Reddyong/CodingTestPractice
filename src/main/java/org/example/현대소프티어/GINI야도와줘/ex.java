package org.example.현대소프티어.GINI야도와줘;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex {
    static int result = -1;
    static int temp = -1;
    static int R;
    static int C;
    static String[][] map;
    static int[] wash = new int[2];
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {

        init();

        queue.add(new int[]{wash[0], wash[1], 0});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];
            int count = poll[2];

            if (temp != count) {
                updateRain();
                changeRain();
            }

            if (map[x][y].equals(".")) {
                map[x][y] = "W";
            }

            for (int i = 0; i < 4; i++) {
                int newI = x + dx[i];
                int newJ = y + dy[i];

                if (newI < 0 || newI >= R || newJ < 0 || newJ >= C) {
                    continue;
                }
                if (map[newI][newJ].equals("H")) {
                    result = count + 1;
                    break;
                }
                if (map[newI][newJ].equals(".")) {
                    queue.add(new int[]{newI, newJ, count + 1});
                    map[newI][newJ] = "W";
                }
            }

            temp = count;

            if (result != -1) {
                break;
            }
        }

        if (result == -1) {
            System.out.println("FAIL");
        } else {
            System.out.println(result);
        }

    }

    private static void changeRain() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals("$")) {
                    map[i][j] = "*";
                }
            }
        }
    }

    private static void updateRain() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals(".")) {
                    checkRain(i, j);
                }
            }
        }
    }

    private static void checkRain(int i, int j) {
        for (int a = 0; a < 4; a++) {
            int newI = i + dx[a];
            int newJ = j + dy[a];

            if (newI < 0 || newI >= R || newJ < 0 || newJ >= C) {
                continue;
            }
            if (map[newI][newJ].equals(".") || map[newI][newJ].equals("W")) {
                map[newI][newJ] = "$";
            }
        }
    }

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        R = scanner.nextInt();
        C = scanner.nextInt();
        map = new String[R][C];

        for (int i = 0; i < map.length; i++) {
            String cur = scanner.next();
            String[] split = cur.split("");
            for (int j = 0; j < map[i].length; j++) {
                if (split[j].equals("W")) {
                    wash[0] = i;
                    wash[1] = j;
                }
                map[i][j] = split[j];
            }
        }

        scanner.close();
    }
}
