package org.example.파일명정렬;

import java.util.Arrays;
import java.util.Comparator;

public class ex {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        String[][] answer2 = new String[files.length][3];

        for (int i = 0; i < files.length; i++) {
            String s = files[i];

            int startNumIdx = -1;
            int endNumIdx = -1;
            boolean first = true;
            int size = 0;

            for (int j = 0; j < s.length(); j++) {
                if (Character.isDigit(s.charAt(j))) {
                    if (first) {
                        startNumIdx = j;
                        first = false;
                    }
                    size++;
                } else {
                    if (!first) {
                        break;
                    }
                }
            }

            endNumIdx = startNumIdx + size - 1;

            String head = files[i].substring(0, startNumIdx);
            String number = files[i].substring(startNumIdx, endNumIdx + 1);
            String tail = files[i].substring(endNumIdx + 1);

            answer2[i][0] = head;
            answer2[i][1] = number;
            answer2[i][2] = tail;

        }

//        Arrays.sort(answer2, new Comparator<String[]>() {
//            @Override
//            public int compare(String[] o1, String[] o2) {
//                if (o1[0].toLowerCase().compareTo(o2[0].toLowerCase()) > 0) {
//                    return 1;
//                } else if (o1[0].toLowerCase().compareTo(o2[0].toLowerCase()) < 0) {
//                    return -1;
//                } else {
//                    if ((Integer.parseInt(o1[1]) > Integer.parseInt(o2[1]))) {
//                        return 1;
//                    } else if ((Integer.parseInt(o1[1]) < Integer.parseInt(o2[1]))) {
//                        return -1;
//                    } else {
//                        return 0;
//                    }
//                }
//            }
//        });

        Arrays.sort(answer2, ((o1, o2) -> {
            if (o1[0].toLowerCase().compareTo(o2[0].toLowerCase()) > 0) {
                return 1;
            } else if (o1[0].toLowerCase().compareTo(o2[0].toLowerCase()) < 0) {
                return -1;
            } else {
                if (Integer.parseInt(o1[1]) > Integer.parseInt(o2[1])) {
                    return 1;
                } else if (Integer.parseInt(o1[1]) < Integer.parseInt(o2[1])) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }));

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer2[i][0] + answer2[i][1] + answer2[i][2];
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String[] solution1 = sol.solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"});
        String[] solution2 = sol.solution(new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"});

        for (String s : solution1) {
            System.out.println("s = " + s);
        }

        for (String s : solution2) {
            System.out.println("s = " + s);
        }
    }
}
