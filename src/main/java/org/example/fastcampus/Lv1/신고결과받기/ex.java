package org.example.fastcampus.Lv1.신고결과받기;

import java.util.*;

public class ex {
    Map<String, Integer> called = new HashMap<>();
    Map<String, Integer> ansMap = new HashMap<>();
    Set<String> reportSet = new HashSet<>(); 
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        init(id_list, report);

        return answer;
    }

    private void init(String[] idList, String[] report) {
        for (String id : idList) {
            called.put(id, 0);
            ansMap.put(id, 0);
        }

        for (String rep : report) {
            reportSet.add(rep);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);
        int[] solution2 = sol.solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3);

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
