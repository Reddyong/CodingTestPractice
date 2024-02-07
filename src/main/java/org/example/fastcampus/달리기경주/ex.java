package org.example.fastcampus.달리기경주;

import java.util.*;

public class ex {
    Map<String, Integer> map = new HashMap<>();
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        init(players);

        return answer;
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
