package org.example.fastcampus.Lv2.괄호회전하기;

public class ex {
    public int solution(String s) {
        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution("[](){}");
        int solution2 = sol.solution("}]()[{");
        int solution3 = sol.solution("[)(]");
        int solution4 = sol.solution("}}}");
    }
}
