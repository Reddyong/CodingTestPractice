package org.example.네트워크;

public class ex {
    boolean[] visited;
    int result = 0;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        solve(n, computers);

        answer = result;

        return answer;
    }

    public void solve(int n, int[][] computers){
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                search(i, computers);
                result++;
            }
        }
    }

    public void search(int i, int[][] computers){
        visited[i] = true;
        for(int j = 0; j < computers.length; j++){
            if(isLinked(i, j, computers) && !visited[j]){
                search(j, computers);
            }
        }
    }

    public boolean isLinked(int i, int j, int[][] computers){
        if(computers[i][j] == 1 && i != j){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
        int solution2 = sol.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}});
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
//    public int solution(int n, int[][] computers) {
//        boolean[] visited = new boolean[n];
//        int answer = 0;
//
//        answer = network(n, computers, visited);
//
//        // 1 1 0
//        // 1 1 0
//        // 0 0 1
//
//        // false, false, false
//        return answer;
//    }
//    public int network(int n, int[][] computers, boolean[] visited){
//        int answer = 0;
//        for(int i=0;i<n;i++){
//            if(!visited[i]){
//                search(i, visited, computers, n);
//                answer++;
//            }
//
//        }
//        return answer;
//    }
//    public boolean linked(int i, int j, boolean[] visited, int[][] computers){
//        if(computers[i][j] == 1 && i != j && !visited[j]){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//    public void search(int i, boolean[] visited, int[][] computers, int n){
//        visited[i] = true;
//
//        for(int j=0;j<n;j++){
//            if(linked(i, j, visited, computers)){
//                search(j, visited, computers, n);
//            }
//        }
//    }
}
