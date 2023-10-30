package org.example.숫자변환하기;

public class ex {
    int cnt = Integer.MAX_VALUE;
    public int solution(int x, int y, int n) {
        int answer = 0;

        mulThree(x, y, n, 0);
        mulTwo(x, y, n, 0);
        plusN(x, y, n, 0);

        answer = cnt;

        if (x == y) {
            return 0;
        }

        if (cnt == Integer.MAX_VALUE) {
            return -1;
        }

        return answer;
    }

    public void plusN(int x, int y, int n, int count) {
        if (y < x || count > cnt) {
            return;
        }

        if (y == x && count <= cnt) {
            cnt = count;
        }

        mulThree(x, y - n, n, count + 1);
        mulTwo(x, y - n, n, count + 1);
        plusN(x, y - n, n, count + 1);
    }

    public void mulTwo(int x, int y, int n, int count) {
        if (y % 2 != 0) {
            return;
        }

        if (y < x || count > cnt) {
            return;
        }

        if (y == x && count <= cnt) {
            cnt = count;
        }

        mulThree(x, y / 2, n, count + 1);
        mulTwo(x, y / 2, n, count + 1);
        plusN(x, y / 2, n, count + 1);
    }

    public void mulThree(int x, int y, int n, int count) {
        if (y % 3 != 0) {
            return;
        }

        if (y < x || count > cnt) {
            return;
        }

        if (y == x && count <= cnt) {
            cnt = count;
        }

        mulThree(x, y / 3, n, count + 1);
        mulTwo(x, y / 3, n, count + 1);
        plusN(x, y / 3, n, count + 1);
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(10, 40, 5);
//        int solution2 = sol.solution(10, 40, 30);
//        int solution3 = sol.solution(2, 5, 4);

        System.out.println("solution1 = " + solution1);
//        System.out.println("solution2 = " + solution2);
//        System.out.println("solution3 = " + solution3);
    }
}
