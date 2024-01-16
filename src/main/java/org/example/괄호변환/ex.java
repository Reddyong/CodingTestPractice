package org.example.괄호변환;

public class ex {
    public String solution(String p) {
        String answer = "";

        if (checkCorrect(p)) {
            return p;
        }

        String a = findAnswer(p);

        return answer;
    }

    private String findAnswer(String p) {
        if (p.equals("")) {
            return "";
        }

        int idx = findIndex(p);

    }

    private int findIndex(String p) {
        int l = 0;
        int r = 0;

        for (int i = 0; i < p.length(); i++) {
            if (p.substring(i, i + 1).equals("(")) {
                l++;
            } else {
                r++;
            }

            if (l == r) {
                return i;
            }
        }

        return p.length() - 1;
    }

    private boolean checkCorrect(String u) {
        if (u.substring(0, 1).equals(")")) {
            return false;
        }

        int len = u.length();
        int left = 0;
        int right = 0;

        for (int i = 0; i < len; i++) {
            if (u.substring(i, i + 1).equals("(")) {
                left++;
            } else {
                right++;
            }

            if (right > left) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution("(()())()");
        String solution2 = sol.solution(")(");
        String solution3 = sol.solution("()))((()");

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
