package org.example.현대소프티어.강의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Time implements Comparable<Time>{

    private int startTime;
    private int endTime;

    public Time(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    @Override
    public int compareTo(Time t) {
        return this.endTime - t.endTime;
    }

    @Override
    public String toString() {
        return "Time{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
public class ex {

    static int N;
    static List<Time> times = new ArrayList<>();
    static int checkPoint = 0;
    static int result = 0;

    public static void main(String[] args) throws IOException {

        init();
        getAnswer();
        showAnswer();
    }

    private static void showAnswer() {
        System.out.println(result);
    }

    private static void getAnswer() {

        for (Time time : times) {
            int start = time.getStartTime();
            int end = time.getEndTime();

            if (start >= checkPoint) {
                checkPoint = end;
                result++;
            }
        }
    }

    private static void init() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            times.add(new Time(start, end));
        }

        Collections.sort(times);

    }
}
