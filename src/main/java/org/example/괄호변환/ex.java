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
        String u = p.substring(0, idx + 1);
        String v = p.substring(idx + 1);
        String ans = "";

        if (checkCorrect(u)) {
            ans = findAnswer(v);
            return u + ans;
        }

        String deletedU = u.substring(1, u.length() - 1);
        ans = "(" + findAnswer(v) + ")" + changeDeleted(deletedU);

        return ans;
    }

    private String changeDeleted(String deletedU) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < deletedU.length(); i++) {
            if (deletedU.substring(i, i + 1).equals("(")) {
                sb.append(")");
            } else {
                sb.append("(");
            }
        }

        return sb.toString();
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
