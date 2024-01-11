package org.example.방금그곡;

public class ex {
    String ansSave = "(None)";
    String startTime;
    String endTime;
    String title;
    String code;
    int playingTime;
    int max = Integer.MIN_VALUE;
    public String solution(String m, String[] musicinfos) {
        String answer = "";

        m = convert(m);

        for (String musicinfo : musicinfos) {
            initMusicInfo(musicinfo);
            findMusic(m);
        }

        answer = ansSave;
        return answer;
    }

    public String convert(String m) {
        m = m.replaceAll("C#", "c");
        m = m.replaceAll("D#", "d");
        m = m.replaceAll("F#", "f");
        m = m.replaceAll("G#", "g");
        m = m.replaceAll("A#", "a");

        return m;

    }

    private void findMusic(String m) {
        String s = "";
        for (int i = 0; i < playingTime; i++) {
            s += code.charAt(i % code.length());
        }

        if (s.contains(m)) {
            if (max < s.length()) {
                ansSave = title;
                max = s.length();
            }
        }
    }

    private void initMusicInfo(String musicinfo) {
        String[] split = musicinfo.split(",");
        startTime = split[0];
        endTime = split[1];
        playingTime = calcTime();
        title = split[2];
        code = convert(split[3]);
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

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
