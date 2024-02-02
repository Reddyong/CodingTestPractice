package org.example.현대소프티어.징검다리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex {
    static int N;
    static int result;
    static int[] stones;
    public static void main(String[] args) throws IOException {

        init();
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        result = 0;
        stones = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            stones[i] = Integer.parseInt(st.nextToken());
        }
    }
}
