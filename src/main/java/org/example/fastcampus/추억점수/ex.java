package org.example.fastcampus.추억점수;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ex {
    Map<String, Integer> map = new HashMap<>();
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        init(name, yearning);
        answer = checkPhoto(photo);

        return answer;
    }

    private int[] checkPhoto(String[][] photo) {
        int[] temp = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            for (String p : photo[i]) {
                if (map.containsKey(p)) {
                    temp[i] += map.get(p);
                }
            }
        }

        return temp;
    }

    private void init(String[] name, int[] yearning) {
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}});
        int[] solution2 = sol.solution(new String[]{"kali", "mari", "don"}, new int[]{11, 1, 55}, new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}});
        int[] solution3 = sol.solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));

    }
}
