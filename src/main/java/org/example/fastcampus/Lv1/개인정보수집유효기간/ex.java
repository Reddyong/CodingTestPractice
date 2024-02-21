package org.example.fastcampus.Lv1.개인정보수집유효기간;

import java.util.*;

public class ex {
    int todayNum;
    Map<String, Integer> termMap = new HashMap<>();
    List<Integer> ansList = new ArrayList<>();
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};

        init(today, terms);
        getResult(privacies);
        answer = changeToArr();

        return answer;
    }

    private void init(String today, String[] terms) {
        todayNum = changeYearToDay(today);

        for (String term : terms) {
            String[] split = term.split(" ");
            String grade = split[0];
            int gradeMonth = Integer.parseInt(split[1]);

            termMap.put(grade, gradeMonth);
        }
    }

    private int changeYearToDay(String date) {
        int year = Integer.parseInt(date.substring(0, 4)) - 2000;
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        return (year * 12 * 28) + month * 28 + day;
    }

    private void getResult(String[] privacies) {
        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            String grade = split[1];
            int date = changeYearToDay(split[0]);

            if (checkIsDestroy(grade, date)) {
                ansList.add(i + 1);
            }
        }
    }

    private boolean checkIsDestroy(String grade, int date) {
        int checkDate = (termMap.get(grade) * 28) + date - 1;

        if (checkDate < todayNum) {
            return true;
        }

        return false;
    }

    private int[] changeToArr() {
        int[] ans = new int[ansList.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
        int[] solution2 = sol.solution("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));

    }
}
