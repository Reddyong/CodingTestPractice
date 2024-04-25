package org.example.fastcampus.Lv2.후보키;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex {
    List<String> candidateKey = new ArrayList<>();
    boolean[] visited;
    int R;
    int C;
    public int solution(String[][] relation) {
        int answer = 0;

        answer = getTotalCandidateKey(relation);

        return answer;
    }

    private int getTotalCandidateKey(String[][] relation) {
        int ans = 0;
        R = relation.length;
        C = relation[0].length;

        for (int i = 0; i < C; i++) {
            visited = new boolean[C];

            dfs(0, i + 1, 0, relation);
        }

        ans = candidateKey.size();

        return ans;
    }

    private void dfs(int start, int end, int depth, String[][] relation) {
        if (end == depth) {
            List<Integer> list = new ArrayList<>();
            String key = "";

            for (int i = 0; i < C; i++) {
                if (visited[i]) {
                    key += String.valueOf(i);
                    list.add(i);
                }
            }

            Set<String> set = new HashSet<>();

            for (int i = 0; i < R; i++) {
                String s = "";
                for (Integer l : list) {
                    s += relation[i][l];
                }

                if (!set.isEmpty() && set.contains(s)) {
                    return;
                }

                set.add(s);
            }

            for (String c : candidateKey) {
                int count = 0;
                for (int i = 0; i < key.length(); i++) {
                    String temp = String.valueOf(key.charAt(i));

                    if (c.contains(temp)) {
                        count++;
                    }
                }

                if (count == c.length()) {
                    return;
                }
            }

            candidateKey.add(key);

            return;
        }

        for (int i = start; i < C; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i, end, depth + 1, relation);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(new String[][]{{"100", "ryan", "music", "2"}, {"200", "apeach", "math", "2"}, {"300", "tube", "computer", "3"}, {"400", "con", "computer", "4"}, {"500", "muzi", "music", "3"}, {"600", "apeach", "music", "2"}});

        System.out.println("solution = " + solution);
    }
}
