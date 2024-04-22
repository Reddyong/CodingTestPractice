package org.example.fastcampus.Lv2.올바른괄호;

import java.util.Stack;

public class ex {
    Stack<Character> stack;
    public boolean isValid(String s) {
        boolean answer = false;

        answer = getResult(s);

        return answer;
    }

    private boolean getResult(String s) {
        stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (isOpened(cur)) {
                stack.push(cur);
                continue;
            }

            if (stack.isEmpty() || !isMatched(cur)) {
                return false;
            }

            stack.pop();
        }

        return stack.isEmpty();
    }

    private boolean isMatched(char cur) {
        Character peek = stack.peek();

        if (cur == ')') {
            if (peek == '(') {
                return true;
            }
        }
        if (cur == '}') {
            if (peek == '{') {
                return true;
            }
        }

        if (cur == ']') {
            if (peek == '[') {
                return true;
            }
        }

        return false;
    }

    private boolean isOpened(char cur) {
        if (cur == '(' || cur == '{' || cur == '[') {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        boolean solution1 = sol.isValid("()");
        boolean solution2 = sol.isValid("()[]{}");
        boolean solution3 = sol.isValid("(]");

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
