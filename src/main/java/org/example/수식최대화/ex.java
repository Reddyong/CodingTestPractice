package org.example.수식최대화;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex {
    List<Character> operator = List.of('*', '-', '+');
    List<Character> op = new ArrayList<>();
    List<Long> num = new ArrayList<>();
    char[] cases = new char[3];
    boolean[] visited = new boolean[3];
    long temp = Long.MIN_VALUE;
    public long solution(String expression) {
        long answer = 0;

        initNumAndOp(expression);
        System.out.println("num = " + num);
        System.out.println("op = " + op);

        return answer;
    }

    public void initNumAndOp(String expression) {
        int start = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (operator.contains(expression.charAt(i))) {
                String sub = expression.substring(start, i);
                long l = Long.parseLong(sub);
                num.add(l);
                op.add(expression.charAt(i));

                start = i + 1;
            }
        }
        String substring = expression.substring(start);
        long l = Long.parseLong(substring);
        num.add(l);
    }

    public static void main(String[] args) {
        ex sol = new ex();
        long solution1 = sol.solution("100-200*300-500+20");
//        long solution2 = sol.solution("50*6-3*2");

        System.out.println("solution1 = " + solution1);
//        System.out.println("solution2 = " + solution2);
    }
}
