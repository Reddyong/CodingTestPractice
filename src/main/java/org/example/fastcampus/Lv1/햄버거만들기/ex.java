package org.example.fastcampus.Lv1.햄버거만들기;

import java.util.ArrayList;
import java.util.List;

public class ex {
    List<Integer> list = new ArrayList<>();
    int temp = 0;
    public int solution(int[] ingredient) {
        int answer = 0;

        getResult(ingredient);
        answer = temp;

        return answer;
    }

    private void getResult(int[] ingredient) {
        for (int i : ingredient) {
            list.add(i);
            while (list.size() > 3) {
                int one = list.get(list.size() - 4);
                int two = list.get(list.size() - 3);
                int three = list.get(list.size() - 2);
                int four = list.get(list.size() - 1);

                if (one == 1 && two == 2 && three == 3 && four == 1) {
                    for (int j = 0; j < 4; j++) {
                        list.remove(list.size() - 1);
                    }
                    temp++;
//                    break;
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        int solution2 = sol.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
