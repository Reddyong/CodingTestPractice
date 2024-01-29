package org.example.숫자카드나누기;

public class ex {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int maxA = arrayA[0];
        int maxB = arrayB[0];

        maxA = getResult(arrayA, maxA);
        maxB = getResult(arrayB, maxB);

        if (maxA > maxB) {
            answer = getAnswer(arrayB, maxA);
        } else {
            answer = getAnswer(arrayA, maxB);
        }
        return answer;
    }

    private int getAnswer(int[] array, int max) {
        boolean tf = true;
        int result = 0;

        for (int a : array) {
            if (a % max == 0) {
                tf = false;
            }
        }

        if (tf) {
            result = max;
        }
        return result;
    }

    private int getResult(int[] array, int max) {
        for (int i = 1; i < array.length; i++) {
            max = gcd(array[i], max);
        }

        return max;
    }

    private int gcd(int result, int cur) {
        if (cur == 0) {
            return result;
        }

        return gcd(cur, result % cur);
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{10, 17}, new int[]{5, 20});
        int solution2 = sol.solution(new int[]{10, 20}, new int[]{5, 17});
        int solution3 = sol.solution(new int[]{14, 35, 119}, new int[]{18, 30, 102});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
