package org.example.이중우선순위큐;

import java.util.Collections;
import java.util.PriorityQueue;

public class ex {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> queueMin = new PriorityQueue<>();
        PriorityQueue<Integer> queueMax = new PriorityQueue<>(Collections.reverseOrder());

//        answer[0] = Integer.MIN_VALUE;
//        answer[1] = Integer.MAX_VALUE;
        int count = 0;

        for(int i = 0; i < operations.length; i++){
            if (operations[i].charAt(0) == 'I') {
                queueMax.add(Integer.parseInt(operations[i].substring(2)));
                queueMin.add(Integer.parseInt(operations[i].substring(2)));
                count++;
            } else if (matchMin(operations[i], queueMin)) {
                queueMin.poll();
                count--;
//                queueMax.remove(min);
            } else if (matchMax(operations[i], queueMax)) {
                queueMax.poll();
                count--;
//                queueMin.remove(max);
            }
            if (count == 0) {
                queueMin.clear();
                queueMax.clear();
            }
            System.out.println("queueMax = " + queueMax);
            System.out.println("queueMin = " + queueMin);
            System.out.println("=========================");
        }

        if (!queueMin.isEmpty() && !queueMax.isEmpty()) {
            answer[0] = queueMax.peek();
            answer[1] = queueMin.peek();
        }

//        if (count == 1) {
//            answer[0] = queueMax.peek();
//            answer[1] = answer[1];
//        } else if (count > 1) {
//            answer[0] = queueMax.peek();
//            answer[1] = queueMin.peek();
//        }

        return answer;
    }

    public int changeToNum(String num){
        if (num.charAt(0) != 'I') {
            return 0;
        }
        for(int i = 1; i < num.length(); i++){
            if(num.charAt(i - 1) == ' '){
                String substring = num.substring(i);
                return Integer.parseInt(substring);
            }
        }
        return 0;
    }

    public boolean matchMax(String max, PriorityQueue<Integer> queueMax){
        if(max.equals("D 1") && !queueMax.isEmpty()){
            return true;
        }

        return false;
    }

    public boolean matchMin(String min, PriorityQueue<Integer> queueMin){
        if(min.equals("D -1") && !queueMin.isEmpty()){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"});
        int[] solution2 = sol.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});

        for (int i : solution1) {
            System.out.println("s1 = " + i);
        }
        System.out.println("===================");
        for (int i : solution2) {
            System.out.println("s2 = " + i);
        }
    }
}
