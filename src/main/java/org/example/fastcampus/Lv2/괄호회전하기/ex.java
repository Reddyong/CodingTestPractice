package org.example.fastcampus.Lv2.괄호회전하기;

import java.util.LinkedList;
import java.util.Queue;

public class ex {
    Queue<Character> queue = new LinkedList<>();
    public int solution(String s) {
        int answer = -1;

        init(s);

        return answer;
    }

    private void init(String s) {
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution("[](){}");
        int solution2 = sol.solution("}]()[{");
        int solution3 = sol.solution("[)(]");
        int solution4 = sol.solution("}}}");
    }
}
