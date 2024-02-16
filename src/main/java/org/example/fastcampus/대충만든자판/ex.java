package org.example.fastcampus.대충만든자판;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ex {
    Map<Character, Integer> map = new HashMap<>();
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (String key : keymap) {
            makeKeyMap(key);
        }

        for (int i = 0; i < targets.length; i++) {
            answer[i] = getResult(targets[i]);
        }

        return answer;
    }

    private int getResult(String target) {
        int sum = 0;

        for (int i = 0; i < target.length(); i++) {
            char cur = target.charAt(i);

            if (!map.containsKey(cur)) {
                sum = -1;
                break;
            }

            sum += map.get(cur);
        }

        return sum;
    }

    private void makeKeyMap(String key) {
        for (int i = 0; i < key.length(); i++) {
            char cur = key.charAt(i);
            if (!map.containsKey(cur)) {
                map.put(cur, i + 1);
                continue;
            }

            if (map.get(cur) > (i + 1)) {
                map.put(cur, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"});
        int[] solution2 = sol.solution(new String[]{"AA"}, new String[]{"B"});
        int[] solution3 = sol.solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA", "BGZ"});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));

    }
}
