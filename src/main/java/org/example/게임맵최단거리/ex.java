package org.example.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

public class ex {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    int n, m;
    public int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length;

        int[][] visited = new int[n][m];

        bfs(maps, visited);
        answer = visited[n-1][m-1];

        if(answer == 0){
            answer = -1;
        }

        return answer;
    }

    public void bfs(int[][] maps, int[][] visited){
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<Node> qu = new LinkedList<>();
        qu.offer(new Node(x,y));
        while(!qu.isEmpty()){
            Node temp = qu.poll();

            for(int i=0;i<4;i++){
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];

                if(nx >= 0 && nx<n && ny>=0 && ny<m){
                    if(maps[nx][ny] == 1 && visited[nx][ny] ==0){
                        visited[nx][ny] = visited[temp.x][temp.y] + 1;
                        qu.offer(new Node(nx, ny));
                    }
                }
            }
        }
    }

    public class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}});
        int solution2 = sol.solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}});
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }


}
