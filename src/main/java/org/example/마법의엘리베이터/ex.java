package org.example.마법의엘리베이터;

public class ex {
    public int solution(int storey){
        int answer = 0;
        int cur = 1;

        while (storey > 0) {
            int curPow = (int) Math.pow(10, cur);
            int curDev = (int) Math.pow(10, cur - 1);
            int num = storey % curPow;
            int check = num / curDev;

            if (check < 5) {
                answer += check;
                storey -= num;
            } else {
                if (check == 5) {
                    int newSt = storey - num;
                    int n = newSt % (curPow * 10);
                    int k = n / curPow;
                    if (k >= 5) {
                        answer += (10 - check);
                        storey += (curPow - num);
                    }else {
                        answer += check;
                        storey -= num;
                    }
                    continue;
                }
                answer += (10 - check);
                storey += (curPow - num);
            }
            cur++;
        }

        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(16);
        int solution2 = sol.solution(2554);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
