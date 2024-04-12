package org.example.fastcampus.Lv2.영어끝말잇기;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ex {
    int stage = 0;
    int person = 0;
    Set<String> wordSet = new HashSet<>();
    public int[] solution(int n, String[] words) {
        int[] answer = {};

        answer = getFailPerson(n, words);

        return answer;
    }

    private int[] getFailPerson(int n, String[] words) {
        int[] ans = new int[2];

        for (int i = 0; i < words.length; i += n) {
            stage++;
            for (int j = i; j < i + n; j++) {
                if (!wordSet.isEmpty()) {
                    String prev = words[j - 1].substring(words[j - 1].length() - 1);
                    String cur = words[j].substring(0, 1);

                    if (wordSet.contains(words[j]) || !prev.equals(cur)) {
                        person = j - i + 1;
                        ans[0] = person;
                        ans[1] = stage;

                        return ans;
                    }
                }
                wordSet.add(words[j]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        int[] solution2 = sol.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        int[] solution3 = sol.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
    }
}
