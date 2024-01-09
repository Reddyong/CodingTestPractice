package org.example.전력망을둘로나누기;

import java.util.HashSet;
import java.util.Set;

public class ex {
    int cnt = Integer.MAX_VALUE;
    public int solution(int n, int[][] wires) {
        int answer = -1;

        for (int i = 0; i < wires.length; i++) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            boolean[] b = new boolean[wires.length];
            b[i] = true;
            dfs(wires, set1, b, wires[i][0]);
            dfs(wires, set2, b, wires[i][1]);

            int c = Math.abs(set1.size() - set2.size());
            if (c < cnt) {
                cnt = c;
            }
        }

        answer = cnt;

        return answer;
    }

    public void dfs(int[][] wires, Set<Integer> set, boolean[] b, int cur) {
        set.add(cur);

        for (int i = 0; i < wires.length; i++) {
            if (b[i] || (wires[i][0] != cur && wires[i][1] != cur)) {
                continue;
            }
            if (wires[i][0] == cur) {
                b[i] = true;
                set.add(wires[i][1]);
                dfs(wires, set, b, wires[i][1]);
            }
            if (wires[i][1] == cur) {
                b[i] = true;
                set.add(wires[i][0]);
                dfs(wires, set, b, wires[i][0]);
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}});
        int solution2 = sol.solution(4, new int[][]{{1, 2}, {2, 3}, {3, 4}});
        int solution3 = sol.solution(7, new int[][]{{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
