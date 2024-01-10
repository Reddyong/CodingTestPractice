package org.example.방금그곡;

public class ex {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution("ABCDEFG", new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"});
        String solution2 = sol.solution("CC#BCC#BCC#BCC#B", new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"});
        String solution3 = sol.solution("ABC", new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"});
    }
}
