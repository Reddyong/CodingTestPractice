package org.example;

import java.util.ArrayList;

public class ex12 {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            if(i == 0){
                list.add(i);
            }
            else if(i == 1){
                list.add(i);
            }
            else{
                list.add(list.get(i-2) % 1234567 + list.get(i-1) % 1234567);
            }
//            pivo(list, i);
        }

//        int num = list.get(list.size() - 1) + list.get(list.size() - 2);
        int num = list.get(list.size() - 1);
        answer = num % 1234567;

        return answer;
    }

    public void pivo(ArrayList<Integer> list, int i) {
        if(i == 0){
            list.add(i);
        }
        else if(i == 1){
            list.add(i);
        }
        else{
            list.add(list.get(i-2) % 1234567 + list.get(i-1) % 1234567);
        }
    }

    public static void main(String[] args) {
        ex12 sol = new ex12();
        int solution = sol.solution(5);
        System.out.println("solution = " + solution);
    }
}
