package org.example.fastcampus.Lv1.신고결과받기;

import java.util.*;

public class ex {
    Map<String, Integer> called = new HashMap<>();
    Map<String, Integer> ansMap = new HashMap<>();
    Set<String> reportSet = new HashSet<>(); 
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        init(id_list, report);
        saveReport();
        answer = getResult(id_list, k);

        return answer;
    }

    private int[] getResult(String[] idList, int k) {
        int[] ans = new int[idList.length];

        saveToMap(k);
        ans = mapToArr(idList, ans);

        return ans;
    }

    private int[] mapToArr(String[] idList, int[] ans) {
        for (int i = 0; i < idList.length; i++) {
            ans[i] = ansMap.get(idList[i]);
        }

        return ans;
    }

    private void saveToMap(int k) {
        for (String rep : reportSet) {
            String[] split = rep.split(" ");
            String give = split[0];
            String receive = split[1];

            if (called.get(receive) >= k) {
                ansMap.put(give, ansMap.get(give) + 1);
            }
        }
    }

    private void saveReport() {
        for (String rep : reportSet) {
            String[] split = rep.split(" ");

            called.put(split[1], called.get(split[1]) + 1);
        }
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
