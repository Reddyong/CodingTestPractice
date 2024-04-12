package org.example.fastcampus.Lv2.이진변환반복하기;

import java.util.Arrays;

public class ex {
    int num = 0;
    int zero = 0;
    public int[] solution(String s) {
        int[] answer = {};

        answer = changingBinary(s);

        return answer;
    }

    private int[] changingBinary(String s) {
        int[] ans = new int[2];
        int len = s.length();
        int temp = 0;

        while (!s.equals("1")) {
            s = s.replace("0", "");

            temp = len - s.length();
            zero += temp;

            s = Integer.toBinaryString(s.length());
            len = s.length();

            num++;
        }

        ans[0] = num;
        ans[1] = zero;

        return ans;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution("110010101001");
        int[] solution2 = sol.solution("01110");
        int[] solution3 = sol.solution("1111111");

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
    }
}
