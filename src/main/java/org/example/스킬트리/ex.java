package org.example.스킬트리;

import java.util.LinkedList;
import java.util.Queue;

public class ex {
    int count = 0;
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skillTree : skill_trees) {
            Queue<Character> queue = new LinkedList<>();
            solve(skillTree, queue, skill);
            if (count != 0) {
                if (queue.size() == skill.length() && count != 0) {
                    answer++;
                }
                if (queue.isEmpty() || queue.size() != skill.length()) {
                    answer++;
                }
            }
            count = 0;
        }

        return answer;
    }

    public void solve(String skillTree, Queue<Character> queue, String skill) {
        for (int i = 0; i < skill.length(); i++) {
            queue.add(skill.charAt(i));
        }

        for (int j = 0; j < skillTree.length(); j++) {
            if (queue.peek() == null) {
                return;
            }
            if (skillTree.charAt(j) != queue.peek() && queue.contains(skillTree.charAt(j))) {
                count = 0;
                return;
            }

            if (queue.peek() == skillTree.charAt(j)) {
                queue.poll();
            }
            count++;

        }

    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});
//        int solution2 = sol.solution("CBD", new String[]{"AEF", "ZJW"});
//        int solution3 = sol.solution("REA", new String[]{"REA", "POA"});
//        int solution4 = sol.solution("CBD", new String[]{"CAD"});
//        int solution5 = sol.solution("CBDK", new String[]{"CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK"});

        System.out.println("solution = " + solution);
//        System.out.println("solution2 = " + solution2);
//        System.out.println("solution3 = " + solution3);
//        System.out.println("solution4 = " + solution4);
//        System.out.println("solution5 = " + solution5);
    }
}
