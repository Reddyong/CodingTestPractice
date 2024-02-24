package org.example.fastcampus.Lv0.다음에올숫자;

public class ex {
    String check = "";
    public int solution(int[] common) {
        int answer = 0;

        isArithOrGeo(common);
        answer = getResult(common);

        return answer;
    }

    private int getResult(int[] common) {
        int lastNum = common[common.length - 1];
        int secondNum = common[common.length - 2];
        int dif = 0;

        if (check.equals("arith")) {
            dif = lastNum - secondNum;
            return lastNum + dif;
        }

        dif = lastNum / secondNum;
        return lastNum * dif;
    }

    private void isArithOrGeo(int[] common) {
        if ((common[1] - common[0]) == (common[2] - common[1])) {
            check = "arith";
            return;
        }
        if ((common[1] / common[0]) == (common[2] / common[1])) {
            check = "geo";
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{1, 2, 3, 4});
        int solution2 = sol.solution(new int[]{2, 4, 8});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
