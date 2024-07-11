package org.example.fastcampus.Lv2.파일명정렬;

import java.util.Arrays;
import java.util.Comparator;

public class ex {
    public String[] solution(String[] files) {
        String[] answer = {};


        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String[] solution1 = sol.solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"});
        String[] solution2 = sol.solution(new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
