package org.example.단속카메라;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex {
    public int solution(int[][] routes) {
        int answer = 0;

        int checkPoint = -30000;
        List<Actions> list = new ArrayList<>();

        timeToList(routes, list);

        answer = getAnswer(answer, checkPoint, list);

        return answer;
    }

    public static int getAnswer(int answer, int checkPoint, List<Actions> list) {
        for (Actions actions : list) {
            if (!actions.isChecked() && checkPoint <= actions.getEndTime()) {
                checkPoint = actions.getEndTime();
                actions.setChecked(true);
                howManyCars(list, checkPoint);
                answer++;
            }
        }
        return answer;
    }

    public static void howManyCars(List<Actions> list, int checkPoint) {
        for (Actions actions : list) {
            isBetweenTime(checkPoint, actions);
        }
    }

    public static void isBetweenTime(int checkPoint, Actions actions) {
        if (!actions.isChecked()) {
            if (checkPoint >= actions.getStartTime() && checkPoint <= actions.getEndTime()) {
                actions.setChecked(true);
            }
        }
    }

    public static void timeToList(int[][] routes, List<Actions> list) {
        for (int[] route : routes) {
            list.add(new Actions(route[0], route[1], false));
        }
        Collections.sort(list);
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(new int[][]{{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}});
        int solution1 = sol.solution(new int[][]{{-20, -15}, {-14, -12}, {-11, -8}, {-7, -3}});

        System.out.println("solution = " + solution);
        System.out.println("solution1 = " + solution1);
    }
}
