package org.example.fastcampus.Lv1.덧칠하기;

public class ex {
    int answer;
    int start;
    int end;
    public int solution(int n, int m, int[] section) {

        initStartPoint(section, m);
        getPaintingCount(section, n, m);

        return answer;
    }

    private void getPaintingCount(int[] section, int n, int m) {
        for (int sec : section) {
            if (sec >= start && sec <= end) {
                continue;
            }

            start = sec;
            end = start + m - 1;
            answer++;
        }
    }

    private void initStartPoint(int[] section, int m) {
        answer = 1;
        start = section[0];
        end = start + m - 1;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(8, 4, new int[]{2, 3, 6});
        int solution2 = sol.solution(5, 4, new int[]{1, 3});
        int solution3 = sol.solution(4, 1, new int[]{1, 2, 3, 4});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
