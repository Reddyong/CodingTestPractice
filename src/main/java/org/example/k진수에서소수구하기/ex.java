package org.example.k진수에서소수구하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ex {
    public int solution(int n, int k) {
        int answer = 0;
        List<String> aList = new ArrayList<>();

        String kNum = newNum(n, k);

        solve(aList, kNum);

        aList.remove("");

        for (String s : aList) {
            long pNum = Long.parseLong(s);
            if (!isPrimeNum(pNum)) {
                continue;
            }
            answer++;
        }

        return answer;
    }

    public String newNum(int n, int k){
        Stack<Integer> stack = new Stack<>();

        while(true){
            int q = n / k;
            int r = n % k;
            if(q == 0){
                stack.push(r);
                break;
            }
            stack.push(r);
            n = q;
        }

        String kString = "";
        while(!stack.isEmpty()){
            Integer pop = stack.pop();
            String s = String.valueOf(pop);
            kString += s;
        }

        return kString;
    }

    public void solve(List<String> aList, String kNum){
        String[] split = kNum.split("0");
        for(String s : split){
            aList.add(s);
        }
    }

    public boolean isPrimeNum(long pNum){
        if(pNum == 1){
            return false;
        }
        else if(pNum == 2){
            return true;
        }

        for(long i = 2; i <= Math.sqrt(pNum); i++){
            if(pNum % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(437674, 3);
        int solution2 = sol.solution(110011, 10);
        int solution3 = sol.solution(1000000, 3);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
