package org.example.n진수게임;

import java.util.Stack;

public class ex {
    public String solution(int n, int t, int m, int p) {
        // n = n진수, t = 갯수, m = 인원수, p = 몇번째
        String answer = "";
        int check = 1;
        int num = 0;

        while (true) {
            String s = numToString(num, n);
            for (int i = 0; i < s.length(); i++) {
                String s1 = String.valueOf(s.charAt(i));
                if (m == p) {
                    p = 0;
                }
                if ((check % m) == p) {
                    answer += s1;
                }
                if (answer.length() == t) {
                    break;
                }
                check++;
            }
            num++;

            if (answer.length() >= t) {
                break;
            }
        }

        return answer;
    }

    public String numToString(int num, int n) {
        String s = "";
        Stack<Integer> stack = new Stack<>();

        while (true) {
            int q = num / n;
            int r = num % n;

            stack.push(r);
            num = q;

            if (q == 0) {
                break;
            }
        }

        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            String s2 = String.valueOf(pop);
            if (pop >= 10) {
                String s1 = biggerThanNine(pop);
                s2 = s1;
            }
            s += s2;
        }

        return s;
    }

    public String biggerThanNine(int k) {
        if (k == 10) {
            return "A";
        } else if (k == 11) {
            return "B";
        } else if (k == 12) {
            return "C";
        } else if (k == 13) {
            return "D";
        } else if (k == 14) {
            return "E";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution(2, 4, 2, 1);
        String solution2 = sol.solution(16, 16, 2, 1);
        String solution3 = sol.solution(16, 16, 2, 2);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
