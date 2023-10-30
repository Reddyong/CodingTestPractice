package org.example;

public class ex11 {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        int count2 = 0;

        String sNum = Integer.toBinaryString(n);
        for(int i = 0; i < sNum.length(); i++){
            if(sNum.charAt(i) == '1'){
                count++;
            }
        }
        int temp = n;
        while(true){
            temp++;
            String num = Integer.toBinaryString(temp);
            for(int j = 0; j < num.length(); j++){
                if(num.charAt(j) == '1'){
                    count2++;
                }
            }
            if(count == count2){
                break;
            }
            count2 = 0;
        }

        answer = temp;
        return answer;
    }

    public static void main(String[] args) {
        ex11 sol = new ex11();
        int solution = sol.solution(78);
        System.out.println("solution = " + solution);
    }
}
