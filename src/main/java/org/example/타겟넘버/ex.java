package org.example.타겟넘버;

public class ex {
    int result = 0;
    public int solution(int[] numbers, int target) {
        int answer = 0;

        solve(numbers, target, 0);

        answer = result;

        return answer;
    }
    public void solve(int[] numbers, int target, int depth){
        if (depth == numbers.length) {
            if (target == 0) {
                result++;
            }
            return;
        }

        int plus = target + numbers[depth];
        int minus = target - numbers[depth];

        solve(numbers, plus, depth + 1);
        solve(numbers, minus, depth + 1);
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[]{1, 1, 1, 1, 1}, 3);
        int solution2 = sol.solution(new int[]{4, 1, 2, 1}, 4);
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
//    int count = 0;
//    public int solution(int[] numbers, int target) {
//        int answer = 0;
//        dfs(numbers, 0, target, 0);
//        answer = count;
//
//        return answer;
//    }
//
//    public void dfs(int[] numbers, int depth, int target, int result){
//        if(depth == numbers.length){
//            if(target == result){
//                count++;
//            }
//            return;
//        }
//
//        int plus = result + numbers[depth];
//        int minus = result - numbers[depth];
//
//        dfs(numbers, depth + 1, target, plus);
//        dfs(numbers, depth + 1, target, minus);
//    }
}
