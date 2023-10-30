package org.example;

import java.util.Stack;

public class ex4 {
    boolean[] visited;
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        visited = new boolean[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            answer[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();

        for(int j = 0; j < numbers.length; j++){
            visited[j] = true;
            for(int k = 0; k < numbers.length; k++){
                if(!visited[k]){
                    stack.add(numbers[k]);
                }
            }
            while (!stack.isEmpty()) {
                Integer peek = stack.pop();
                if (peek > numbers[j]) {
                    answer[j] = peek;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ex4 sol = new ex4();
        int[] solution = sol.solution(new int[]{2, 3, 3, 5});
        for (int s : solution) {
            System.out.println("sol = " + s);
        }
    }
}
