package org.example.fastcampus.Lv2.nx2타일링;

public class ex {
    private static final int DIVIDE_CASES = 1000000007;
    int[] tiles;
    public int solution(int n) {
        int answer = 0;

        initTiles(n);

        return answer;
    }

    private void initTiles(int n) {
        tiles = new int[n];

        if (n < 2) {
            tiles[0] = 1;
            return;
        }

        tiles[0] = 1;
        tiles[1] = 2;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution = sol.solution(4);

        System.out.println("solution = " + solution);
    }
}
