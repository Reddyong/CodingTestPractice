package org.example.fastcampus.Lv1.완주하지못한선수;

public class ex {
    public String solution(String[] participant, String[] completion) {
        String answer = "";



        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        String solution2 = sol.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        String solution3 = sol.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
