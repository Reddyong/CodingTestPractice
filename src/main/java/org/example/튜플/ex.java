package org.example.튜플;

import java.util.*;

public class ex {
    public int[] solution(String s) {
        Queue<Integer> queue = new LinkedList<>();

        String[] split = s.split("\\{|\\},|\\}");

//        Arrays.sort(split, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        Arrays.sort(split, (o1, o2) -> o1.length() - o2.length());

        for (int i = 0; i < split.length; i++) {
            String[] newSplit = split[i].split(",");
            for (String s1 : newSplit) {
                if (s1.equals("")) {
                    continue;
                }
                if (!queue.contains(Integer.parseInt(s1))) {
                    queue.add(Integer.parseInt(s1));
                }
            }
        }

        int[] answer = new int[queue.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = queue.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
        int[] solution2 = sol.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
        int[] solution3 = sol.solution("{{20,111},{111}}");
        int[] solution4 = sol.solution("{{123}}");
        int[] solution5 = sol.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");

        for (int i : solution1) {
            System.out.println("==========solution1===========");
            System.out.println("i = " + i);
        }

        for (int i : solution2) {
            System.out.println("==========solution2===========");
            System.out.println("i = " + i);
        }

        for (int i : solution3) {
            System.out.println("==========solution3===========");
            System.out.println("i = " + i);
        }

        for (int i : solution4) {
            System.out.println("==========solution4===========");
            System.out.println("i = " + i);
        }

        for (int i : solution5) {
            System.out.println("==========solution5===========");
            System.out.println("i = " + i);
        }
    }
}
