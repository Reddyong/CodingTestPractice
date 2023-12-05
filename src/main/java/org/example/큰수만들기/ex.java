package org.example.큰수만들기;

public class ex {
    public String solution(String number, int k) {
        // 4177252841
        String answer = "";
        StringBuilder sb = new StringBuilder(answer);
        int len = number.length() - k;
        int start = 0;

        while (start < number.length() && sb.length() != len) {
            int num = k + sb.length() + 1;
            char max = 0;
            for (int i = start; i < num; i++) {
                if (max < number.charAt(i)) {
                    max = number.charAt(i);
                    start = i + 1;
                }
            }
            sb.append(max);
        }

        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution("1924", 2);
        String solution2 = sol.solution("1231234", 3);
        String solution3 = sol.solution("4177252841", 4);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
