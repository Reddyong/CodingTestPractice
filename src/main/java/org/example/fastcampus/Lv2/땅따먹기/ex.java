package org.example.fastcampus.Lv2.땅따먹기;

public class ex {
    int solution(int[][] land) {
        int answer = 0;

        answer = getMaxLand(land);

        return answer;
    }

    private int getMaxLand(int[][] land) {
        int ans = 0;
        int N = land.length - 1;

        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }

        for (int j = 0; j < 4; j++) {
            ans = Math.max(ans, land[N][j]);
        }

        return ans;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}});

        System.out.println("solution = " + solution);
    }
}
