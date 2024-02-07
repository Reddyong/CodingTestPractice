package org.example.fastcampus.달리기경주;

import java.util.*;

public class ex {
    Map<String, Integer> map = new HashMap<>();
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        init(players);
        answer = getAnswer(players, callings);

        return answer;
    }

    private String[] getAnswer(String[] players, String[] callings) {
        for (String c : callings) {
            Integer rank = map.get(c);
            String front = players[rank - 1];

            map.put(front, rank);
            map.put(c, rank - 1);

            players[rank] = front;
            players[rank - 1] = c;
        }

        return players;
    }

    private void init(String[] players) {
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String[] solution = sol.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});

        System.out.println("solution = " + Arrays.toString(solution));

    }
}
