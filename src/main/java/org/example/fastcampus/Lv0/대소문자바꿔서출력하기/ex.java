package org.example.fastcampus.Lv0.대소문자바꿔서출력하기;

import java.util.Calendar;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        StringBuilder sb = new StringBuilder();
        char[] cArr = str.toCharArray();
        for (char c : cArr) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
                continue;
            }
            sb.append(Character.toUpperCase(c));
        }

        System.out.println(sb.toString());
    }
}
