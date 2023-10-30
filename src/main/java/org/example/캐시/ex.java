package org.example.캐시;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class ex {
    int count;
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        count = 0;
        Queue<String> queue = new LinkedList<>();

        if (cacheSize == 0) {
            return cities.length * 5;
        }
        for (int i = 0; i < cities.length; i++) {
            String lowerCase = cities[i].toLowerCase();
            solve(queue, cacheSize, lowerCase);
        }

        answer = count;

        return answer;
    }

    public void solve(Queue<String> queue, int cacheSize, String city) {
        if (queue.size() < cacheSize && isNotExist(queue, city)) {
            queue.add(city);
            count += 5;
        } else {
            if (isNotExist(queue, city)) {
                queue.poll();
                queue.add(city);
                count += 5;
            } else {
//                String string = queue.stream().filter(s -> s.equals(city)).toString();
                String string = "";
                for (String s : queue) {
                    if (s.equals(city)) {
                        string = s;
                    }
                }
                queue.remove(string);
                queue.add(city);
                count++;
            }
        }
    }

    public boolean isNotExist(Queue<String> queue, String city) {
        if (queue.contains(city)) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
        int solution2 = sol.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"});
        int solution3 = sol.solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
        int solution4 = sol.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
        int solution5 = sol.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"});
        int solution6 = sol.solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"});

        System.out.println("solution = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
        System.out.println("solution4 = " + solution4);
        System.out.println("solution5 = " + solution5);
        System.out.println("solution6 = " + solution6);
    }
}
