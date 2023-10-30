package org.example.괄호회전하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ex {
    public int solution(String s) {
        int answer = 0;
        String[] split = s.split("");
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < split.length; i++) {
            queue.add(split[i]);
        }

        for (int j = 0; j < split.length; j++) {
            answer = solve(queue, answer);
            String poll = queue.poll();
            queue.add(poll);
        }

        return answer;
    }

    public int solve(Queue<String> queue, int answer) {
        Stack<String> stack = new Stack<>();
        for (String check : queue) {
            if (!stack.isEmpty() && isMatched(stack.peek(), check)) {
                stack.pop();
                continue;
            }
            stack.push(check);
        }
        if (!stack.isEmpty()) {
            return answer;
        }
        answer++;
        return answer;
    }

    public boolean isMatched(String peek, String check) {
        if (peek.equals("{") && check.equals("}")) {
            return true;
        } else if (peek.equals("[") && check.equals("]")) {
            return true;
        } else if (peek.equals("(") && check.equals(")")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution("}]()[{");
        System.out.println("solution = " + solution);
    }
}
