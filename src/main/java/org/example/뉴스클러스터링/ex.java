package org.example.뉴스클러스터링;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex {
    public int solution(String str1, String str2) {
        int answer = 0;
        List<String> set1 = new ArrayList<>();
        List<String> set2 = new ArrayList<>();
        List<String> sum = new ArrayList<>();
        List<String> con = new ArrayList<>();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length() - 1; i++) {
            String substring1 = str1.substring(i, i + 2);
            if (!isEnglish(substring1)) {
                continue;
            }
            set1.add(substring1);
        }

        for (int j = 0; j < str2.length() - 1; j++) {
            String substring2 = str2.substring(j, j + 2);
            if (!isEnglish(substring2)) {
                continue;
            }
            set2.add(substring2);
        }

        makeSet(set1, set2, sum, con);

        if (con.size() == 0 && sum.size() == 0) {
            answer = 65536;
        } else {
            answer = (int) (((double)con.size() / (double)sum.size()) * 65536);
        }


        return answer;
    }

    public boolean isEnglish(String substring) {
        for (int i = 0; i < 2; i++) {
            if (!Character.isAlphabetic(substring.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public void makeSet(List<String> set1, List<String> set2, List<String> sum, List<String> con) {
        for (String s : set1) {
            if (set2.remove(s)) {
                con.add(s);
            }
            sum.add(s);
        }
        for (String s : set2) {
            sum.add(s);
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution("FRANCE", "french");
        int solution2 = sol.solution("handshake", "shake hands");
        int solution3 = sol.solution("aa1+aa2", "AAAA12");
        int solution4 = sol.solution("E=M*C^2", "e=m*c^2");
        int solution5 = sol.solution("abab", "baba");

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
        System.out.println("solution4 = " + solution4);
        System.out.println("solution5 = " + solution5);
    }
}
