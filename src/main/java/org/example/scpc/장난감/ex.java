package org.example.scpc.장난감;

import java.io.FileInputStream;
import java.util.Scanner;

public class ex {
    static int Answer;

    public static void main(String[] args) throws Exception {
        /*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new FileInputStream("input3.txt"));

        int T = sc.nextInt();
        for(int test_case = 0; test_case < T; test_case++) {

            // Answer = 0;
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////


            // Print the answer to standard output(screen).
            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }
}
