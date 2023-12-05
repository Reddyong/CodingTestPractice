package org.example.연속된부분수의합;

import java.util.*;

public class ex {
    int startIdx = 0;
    int endIdx = 0;
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int seqLength = sequence.length;
        List<int[]> check = new ArrayList<>();

        saveIndex(sequence, k, seqLength, check);

        answer = getAnswer(check);

        return answer;
    }

    private static int[] getAnswer(List<int[]> check) {
        int[] answer;
        if (check.size() != 1) {
            check.sort((o1, o2) -> (o1[1] - o1[0]) - (o2[1] - o2[0]));
        }

        answer = check.get(0);
        return answer;
    }

    public void saveIndex(int[] sequence, int k, int seqLength, List<int[]> check) {
        for (int i = 0; i < seqLength; i++) {
            int sum = 0;
            for (int j = i; j < seqLength; j++) {
                startIdx = i;
                endIdx = j;
                sum += sequence[j];
                if (sum == k) {
                    check.add(new int[]{startIdx, endIdx});
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new int[]{1, 2, 3, 4, 5}, 7);
        int[] solution2 = sol.solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5);
        int[] solution3 = sol.solution(new int[]{2, 2, 2, 2, 2}, 6);

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
    }
}
