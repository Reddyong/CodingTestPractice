package org.example.fastcampus.Lv2.H_Index;

import java.util.Arrays;

public class ex {
    public int solution(int[] citations) {
        int answer = 0;

        answer = getHIndex(citations);

        return answer;
    }

    private int getHIndex(int[] citations) {
        int ans = 0;
        int len = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i < len; i++) {
            int quotation = citations[i];
            int moreThanQuo = len - i;

            if (quotation >= moreThanQuo) {
                ans = moreThanQuo;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(new int[]{3, 0, 6, 1, 5});

        System.out.println("solution = " + solution);
    }
}
