package org.example.수식최대화;

import java.util.*;

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

        dfs(0, operator.size());

        answer = temp;

        return answer;
    }

    public void solve() {
        List<Character> opList = new ArrayList<>(op);
        List<Long> numList = new ArrayList<>(num);

        for (int i = 0; i < cases.length; i++) {
            char curOp = cases[i];

            for (int j = 0; j < opList.size(); j++) {
                if (opList.get(j) == curOp) {
                    Long newNum = calc(numList.get(j), numList.get(j + 1), curOp);
                    numList.set(j, newNum);
                    numList.remove(j + 1);
                    opList.remove(j);

                    j--;
                }
            }

            temp = Math.max(temp, Math.abs(numList.get(0)));
        }
    }

    public Long calc(Long n1, Long n2, char curOp) {
        if (curOp == '-') {
            return n1 - n2;
        } else if (curOp == '+') {
            return n1 + n2;
        }

        return n1 * n2;
    }


    public void dfs(int depth, int size) {
        if (depth == size) {
            solve();

            return;
        }

        for (int i = 0; i < 3; i++) {
            if (!visited[i]) {
                visited[i] = true;
                cases[depth] = operator.get(i);
                dfs(depth + 1, size);
                visited[i] = false;
            }
        }
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
//        long solution1 = sol.solution("100-200*300-500+20");
        long solution2 = sol.solution("50*6-3*2");

//        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
