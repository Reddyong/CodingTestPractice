package org.example.오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex {
    public String[] solution(String[] record) {
        List<String> array = new ArrayList<>();
        Map<String, String> idName = new HashMap<>();

        save(record, idName);

        solve(record, idName, array);

        String[] answer = new String[array.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = array.get(i);
        }

        return answer;
    }

    public void save(String[] record, Map<String, String> idName) {
        for (String r : record) {
            String[] split = r.split(" ");

            if (!split[0].equals("Leave")) {
                idName.put(split[1], split[2]);
            }
        }
    }

    public void solve(String[] record, Map<String, String> idName, List<String> array) {
        for (String r : record) {
            String[] split = r.split(" ");
            if (split[0].equals("Enter")) {
                String name = idName.get(split[1]);
                String aString = name + "님이 들어왔습니다.";
                array.add(aString);
            } else if (split[0].equals("Leave")) {
                String name = idName.get(split[1]);
                String aString = name + "님이 나갔습니다.";
                array.add(aString);
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String[] solution = sol.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});

        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}
