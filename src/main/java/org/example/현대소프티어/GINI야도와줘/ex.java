package org.example.현대소프티어.GINI야도와줘;

import java.util.Arrays;
import java.util.Scanner;

public class ex {
    static int result = -1;
    static int temp = -1;
    static int R;
    static int C;
    static String[][] map;
    static int[] wash = new int[2];

    public static void main(String[] args) {

        init();

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
