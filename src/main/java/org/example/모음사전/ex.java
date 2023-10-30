package org.example.모음사전;

public class ex {
    int cNum = 0;
    int rNum = 0;
    public int solution(String word) {
        int answer = 0;

        solve("", word);
        answer = rNum;

        return answer;
    }

    public void solve(String check, String word) {
        if (check.equals(word)) {
            rNum = cNum;
            return;
        }
        if (check.length() == 5) {
            return;
        }

        cNum++;
        solve(check + "A", word);

        cNum++;
        solve(check + "E", word);

        cNum++;
        solve(check + "I", word);

        cNum++;
        solve(check + "O", word);

        cNum++;
        solve(check + "U", word);
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution("AAAAE");
//        int solution2 = sol.solution("AAAE");
//        int solution3 = sol.solution("I");
//        int solution4 = sol.solution("EIO");

        System.out.println("solution1 = " + solution1);
//        System.out.println("solution2 = " + solution2);
//        System.out.println("solution3 = " + solution3);
//        System.out.println("solution4 = " + solution4);
    }
}
