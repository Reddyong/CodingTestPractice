package org.example.fastcampus.Lv2.괄호회전하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ex {
    Queue<Character> queue = new LinkedList<>();
    public int solution(String s) {
        int answer = -1;

        init(s);
        answer = getResult();

        return answer;
    }

    private int getResult() {
        int ans = 0;
        int count = 0;
        int size = queue.size();

        while (count < size) {
            if (isCorrectBracket()) {
                ans++;
            }

            Character poll = queue.poll();
            queue.add(poll);
            count++;
        }

        return ans;
    }

    private boolean isCorrectBracket() {
        Stack<Character> stack = new Stack<>();

        for (Character q : queue) {
            if (!stack.isEmpty() && isMatched(stack.peek(), q)) {
                stack.pop();
                continue;
            }

            stack.push(q);
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }

    private boolean isMatched(Character peek, Character q) {
        if(peek == '(' && q == ')'){
            return true;
        }
        if(peek == '{' && q == '}'){
            return true;
        }
        if(peek == '[' && q == ']'){
            return true;
        }

        return false;
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

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
        System.out.println("solution4 = " + solution4);
    }
}
