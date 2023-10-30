package org.example.nc코테;

import java.util.*;

public class ex2 {
    String[] menuAll = {"C", "M", "S", "V", "Y"};
    public String solution(String[] preferences){
        String answer = "";
        Set<String> menuSet = new HashSet<>();
        List<String> order = new ArrayList<>();

        for (String flavor : preferences) {
            String menu1 = flavor.substring(0, 1);
            String menu2 = flavor.substring(1);
            menuSet.add(menu1);
            menuSet.add(menu2);
        }

        int size = menuSet.size();

        Stack<String> stack = new Stack<>();

        menuSet.contains(menuAll.length);

        System.out.println("size = " + size);
        order.add("ZXCV");
        order.add("CCVS");
        order.add("VSSC");
        System.out.println("order = " + order);

        order.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        answer = order.get(0);

        System.out.println("order = " + order);
        return answer;
    }

    public static void main(String[] args) {
        ex2 sol = new ex2();
        String solution1 = sol.solution(new String[]{"CS", "SV"});
        String solution2 = sol.solution(new String[]{"SV", "VS", "SV", "VS"});
        String solution3 = sol.solution(new String[]{"CM", "MS", "SC"});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
