package org.example.불량사용자;

import java.util.HashSet;
import java.util.Set;

public class ex {
    Set<Set<String>> answerSet = new HashSet<>();
    String[] uId;
    String[] bId;
    public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        uId = user_id;
        bId = banned_id;
        Set<String> oneSet = new HashSet<>();

        solve(oneSet, 0);

        answer = answerSet.size();

        return answer;
    }

    public void solve(Set<String> oneSet, int depth) {
        if (depth == bId.length) {
            answerSet.add(oneSet);
            return;
        }

        for (int i = 0; i < uId.length; i++) {
            if (oneSet.contains(uId[i])) {
                continue;
            }
            if (checkBanned(bId[depth], uId[i])) {
                oneSet.add(uId[i]);
                solve(new HashSet<>(oneSet), depth + 1);
                oneSet.remove(uId[i]);
            }
        }
    }

    public boolean checkBanned(String bi, String ui) {
        if (bi.length() != ui.length()) {
            return false;
        }

        for (int i = 0; i < ui.length(); i++) {
            if (bi.charAt(i) == '*') {
                continue;
            }
            if (bi.charAt(i) != ui.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ex sol = new ex();
//        int solution1 = sol.solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"fr*d*", "abc1**"});
//        int solution2 = sol.solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"*rodo", "*rodo", "******"});
        int solution3 = sol.solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"fr*d*", "*rodo", "******", "******"});

//        System.out.println("solution1 = " + solution1);
//        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
