package org.example;

import java.io.*;
import java.util.*;

public class Main {
    static int max = 0;
    public static void main(String[] args) throws IOException {


    }

    public static void dfs(int k, int[][] dungeons, boolean[] visited, int count) {
        if (max < count) {
            max = count;
        }
        if (k < 0) {
            return;
        }
        for (int i = 0; i < dungeons.length; i++) {
            if (k >= dungeons[i][0] && !visited[i]) {
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, visited, count + 1);
                visited[i] = false;
            }
        }


    }

}