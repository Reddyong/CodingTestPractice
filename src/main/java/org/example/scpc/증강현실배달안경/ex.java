package org.example.scpc.증강현실배달안경;

import java.io.FileInputStream;
import java.util.Scanner;

public class ex {
    static int Answer;
    public static void main(String[] args) throws Exception {

//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new FileInputStream("input1.txt"));

        int T = sc.nextInt();
        for(int test_case = 0; test_case < T; test_case++) {

            Answer = 0;
            /////////////////////////////////////////////////////////////////////////////////////////////
            /*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            Answer = solve(N, A, B);
            /////////////////////////////////////////////////////////////////////////////////////////////


            // Print the answer to standard output(screen).
            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }

    public static int solve(int N, int A, int B) {
        int min = (A <= B) ? A : B;
        int max = (A <= B) ? B : A;
        int count = 0;
        int low = N / min;
        while (true) {
            int num = N - (low * min);
            if (num % max == 0) {
                count += low;
                count += (num / max);
                break;
            }
            low--;
        }
        return count;

    }
}
