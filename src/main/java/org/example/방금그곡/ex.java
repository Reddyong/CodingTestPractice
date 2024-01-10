package org.example.방금그곡;

public class ex {
    String startTime;
    String endTime;
    String title;
    String code;
    int playingTime;
    public String solution(String m, String[] musicinfos) {
        String answer = "";

        for (String musicinfo : musicinfos) {
            initMusicInfo(musicinfo);

        }
        return answer;
    }

    private void initMusicInfo(String musicinfo) {
        String[] split = musicinfo.split(",");
        startTime = split[0];
        endTime = split[1];
        playingTime = calcTime();
        title = split[2];
        code = split[3];
    }

    public int calcTime() {
        String[] splitStart = startTime.split(":");
        String[] splitEnd = endTime.split(":");

        int s = Integer.parseInt(splitStart[0]) * 60 + Integer.parseInt(splitStart[1]);
        int e = Integer.parseInt(splitEnd[0]) * 60 + Integer.parseInt(splitEnd[1]);

        return e - s;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        String solution1 = sol.solution("ABCDEFG", new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"});
        String solution2 = sol.solution("CC#BCC#BCC#BCC#B", new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"});
        String solution3 = sol.solution("ABC", new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"});
    }
}
