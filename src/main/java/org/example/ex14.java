package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class ex14 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        // "ac", "ca", "ac", "ac"
        //  1       2   1       2
        //  1           2
        for (int i = 0; i < words.length; i++) {
            if (i % n == 0) {
                count++;
            }
            if(words[i].length() == 1){
                answer[0] = i % n + 1;
                answer[1] = count;
                break;
            }
            if ((i != 0) && words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                answer[0] = i % n + 1;
                answer[1] = count;
                break;
            }
            if (map.containsKey(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = count;
                break;
            } else {
                map.put(words[i], i % n + 1);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        ex14 sol = new ex14();
        int[] solution = sol.solution(2, new String[]{"ac", "ca", "ac", "ac"});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
