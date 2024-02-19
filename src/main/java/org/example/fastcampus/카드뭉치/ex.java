package org.example.fastcampus.카드뭉치;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ex {
    Queue<String> q1 = new LinkedList<>();
    Queue<String> q2 = new LinkedList<>();
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        init(cards1, cards2);
        answer = makeGoal(goal);

        return answer;
    }

    private String makeGoal(String[] goal) {
        for (String g : goal) {
            if (g.equals(q1.peek())) {
                q1.poll();
            } else if (g.equals(q2.peek())) {
                q2.poll();
            } else {
                return "No";
            }
        }

        return "Yes";
    }

    private void init(String[] cards1, String[] cards2) {
        q1.addAll(Arrays.asList(cards1));
        q2.addAll(Arrays.asList(cards2));
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        String solution2 = sol.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
