package org.example;

public class ex10 {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;

        for(int i = 1; i <= n; i++){
            int temp = i;
            sum += temp;
            System.out.println("sum = " + sum);
            while(sum <= n){
                if(sum == n){
                    answer++;
                    System.out.println("answer = " + answer);
                }
                sum = sum + (++temp);
                System.out.println("temp = " + temp);
                System.out.println("sum = " + sum);

            }
            sum = 0;
        }
        return answer;
    }
    public static void main(String[] args) {
        ex10 sol = new ex10();
        int solution = sol.solution(15);
        System.out.println("solution = " + solution);
    }
}
