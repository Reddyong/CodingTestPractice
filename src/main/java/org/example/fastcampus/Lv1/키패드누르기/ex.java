package org.example.fastcampus.Lv1.키패드누르기;

import java.util.HashSet;
import java.util.Set;

public class ex {
    int left = 10;
    int right = 12;
    Set<Integer> leftHand = new HashSet<>(Set.of(1, 4, 7, 10));
    Set<Integer> rightHand = new HashSet<>(Set.of(3, 6, 9, 12));
    public String solution(int[] numbers, String hand) {
        String answer = "";

        answer = getResult(numbers, hand);

        return answer;
    }

    private String getResult(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        for (int number : numbers) {
            if (number == 0) {
                number = 11;
            }

            if (leftHand.contains(number)) {
                left = number;
                sb.append("L");
                continue;
            }
            if (rightHand.contains(number)) {
                right = number;
                sb.append("R");
                continue;
            }

            String cur = checkHands(number, hand);
            sb.append(cur);
        }

        return sb.toString();
    }

    private String checkHands(int number, String hand) {
        int leftDistance = 0;
        int rightDistance = 0;

        leftDistance = getDistance(number, "left");
        rightDistance = getDistance(number, "right");

        if (leftDistance > rightDistance) {
            right = number;
            return "R";
        }
        if (leftDistance < rightDistance) {
            left = number;
            return "L";
        }

        if (hand.equals("right")) {
            right = number;
            return "R";
        }

        left = number;
        return "L";
    }

    private int getDistance(int number, String direction) {
        int distance = 0;

        if (direction.equals("left")) {
            distance = Math.abs(number - left) / 3 + Math.abs(number - left) % 3;
        }
        if (direction.equals("right")) {
            distance = Math.abs(number - right) / 3 + Math.abs(number - right) % 3;
        }

        return distance;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
        String solution2 = sol.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
        String solution3 = sol.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right");

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
