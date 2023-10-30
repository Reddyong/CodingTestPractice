package org.example.scpc.딸기수확로봇;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex {
    static int Answer;

    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new FileInputStream("input2.txt"));

        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {

            Answer = 0;
            /////////////////////////////////////////////////////////////////////////////////////////////
            /*
               Implement your algorithm here.
               The answer to the case will be stored in variable Answer.
             */
            int N = sc.nextInt(); // 딸기 개수
            int D = sc.nextInt(); // 로봇이 이동가능한 거리
            int[] arr = new int[N];
            boolean[] check = new boolean[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            int min = Integer.MAX_VALUE;
            boolean realCheck = true;
            for (int j = 0; j < N; j++) {
                if (arr[j] < 0) {
                    check[j] = false;
                    count++;
                } else {
                    check[j] = true;
                }
                if (Math.abs(arr[j]) < min) {
                    min = Math.abs(arr[j]);
                    realCheck = check[j];
                }
            }

            List<Integer> minus = new ArrayList<>();
            List<Integer> plus = new ArrayList<>();
            for (int k = 0; k < N; k++) {
                if (check[k]) {
                    plus.add(arr[k]);
                } else {
                    minus.add(Math.abs(arr[k]));
                }
            }

            Arrays.sort(plus.toArray());
            Arrays.sort(minus.toArray());

            if (realCheck) {
                for (int i : plus) {
                    D -= i;
                    if (D < 0) {
                        break;
                    }
                    Answer++;
                }
            } else {
                for (int i : minus) {
                    D -= i;
                    Answer++;
                    if (D <= 0) {
                        break;
                    }
                }
            }

            /////////////////////////////////////////////////////////////////////////////////////////////


            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }
}
