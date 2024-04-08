package org.example.fastcampus.Lv2.무인도여행;

import java.lang.reflect.Array;
import java.util.*;

public class ex {
    Map<Integer, Integer> islands;
    boolean[][] visited;
    int[] dx = new int[]{1, 0, -1, 0};
    int[] dy = new int[]{0, 1, 0, -1};
    public int[] solution(String[] maps) {
        int[] answer = {};

        init(maps);
        answer = getIslands(maps);

        return answer;
    }

    private int[] getIslands(String[] maps) {
        List<Integer> ans = new ArrayList<>();

        bfs(maps);

        for (Integer k : islands.keySet()) {
            Integer v = islands.get(k);
            ans.add(v);
        }

        if (ans.isEmpty()) {
            return new int[]{-1};
        }

        int[] arr = new int[ans.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }

        Arrays.sort(arr);

        return arr;
    }

    private void bfs(String[] maps) {
        int count = 1;

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if (visited[i][j] || maps[i].charAt(j) == 'X') {
                    continue;
                }

                Queue<int[]> queue = new LinkedList<>();
                int day = Integer.parseInt(maps[i].substring(j, j + 1));

                queue.add(new int[]{i, j});
                visited[i][j] = true;
                islands.put(count, islands.getOrDefault(count, 0) + day);

                while (!queue.isEmpty()) {
                    int[] poll = queue.poll();

                    for (int k = 0; k < 4; k++) {
                        int nx = poll[1] + dx[k];
                        int ny = poll[0] + dy[k];

                        if (isInBoard(nx, ny, maps) && !visited[ny][nx]) {
                            day = Integer.parseInt(maps[ny].substring(nx, nx + 1));
                            queue.add(new int[]{ny, nx});
                            visited[ny][nx] = true;
                            islands.put(count, islands.getOrDefault(count, 0) + day);
                        }
                    }
                }

                count++;
            }
        }
    }

    private boolean isInBoard(int nx, int ny, String[] maps) {
        if (nx < 0 || ny < 0 || nx >= maps[0].length() || ny >= maps.length) {
            return false;
        }

        if (maps[ny].charAt(nx) == 'X') {
            return false;
        }

        return true;
    }

    private void init(String[] maps) {
        islands = new HashMap<>();
        visited = new boolean[maps.length][maps[0].length()];
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int[] solution1 = sol.solution(new String[]{"X591X", "X1X5X", "X231X", "1XXX1"});
        int[] solution2 = sol.solution(new String[]{"XXX", "XXX", "XXX"});

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
