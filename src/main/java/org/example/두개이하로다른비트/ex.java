package org.example.두개이하로다른비트;

public class ex {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long solve = solve(numbers[i]);
            answer[i] = solve;
        }

        return answer;
    }

    public long solve(long number) {
        if (number % 2 == 0) {
            return number + 1;
        }

        StringBuilder builder = new StringBuilder(Long.toBinaryString(number));
        int length = builder.length();

        if (builder.toString().contains("01")) {
            for (int i = length; i > 0; i--) {
                if (builder.substring(i - 2, i).equals("01")) {
                    builder.setCharAt(i - 2, '1');
                    builder.setCharAt(i - 1, '0');
                    break;
                }
            }
        } else {
            builder.deleteCharAt(0);
            builder.insert(0, "10");
        }
        
        return Long.valueOf(builder.toString(), 2);
    }

    public static void main(String[] args) {
        ex sol = new ex();
        long[] solution = sol.solution(new long[]{2, 7});

        for (long l : solution) {
            System.out.println("l = " + l);
        }
    }
}
