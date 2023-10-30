package org.example;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class ex13 {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char[] split = s.toCharArray();

        stack.add(split[0]);

        for (int i = 1; i < split.length; i++) {
            if (!stack.isEmpty() && split[i] == stack.peek()) {
                stack.pop();
            } else {
                stack.add(split[i]);
            }
        }

        if (stack.isEmpty()) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
    public static void main(String[] args) {
        ex13 sol = new ex13();
        int solution = sol.solution("baabaa");
        System.out.println("solution = " + solution);
    }
}
