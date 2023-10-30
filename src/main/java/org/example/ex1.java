package org.example;

public class ex1 {
    static boolean[] visited;
    static int answer = 0;
    public int solution(String begin, String target, String[] words) {

        visited = new boolean[words.length];

        dfs(begin, target, words, 0);

        return answer;
    }

    public static void main(String[] args) {
        ex1 e = new ex1();
        e.solution("hot", "dot", new String[]{"hit", "dot", "dit"});
    }
    public void dfs(String begin, String target, String[] words, int result){
        if(begin.equals(target)){
            answer = result;
            return;
        }
        for(int i=0;i<words.length;i++){
            if(visited[i]){
                continue;
            }
            // String[] bArray = begin.split("");
            // String[] wArray = words[i].split("");
            int count = 0;
            for(int j=0;j<begin.length();j++){
                if(begin.charAt(j) == words[i].charAt(j)){
                    // if(bArray[j] == wArray[j])
                    count++;
                }
            }

            if(count == begin.length() -1){
                visited[i] = true;
                dfs(words[i], target, words, result + 1);
                visited[i] = false;
            }

        }
    }
}
