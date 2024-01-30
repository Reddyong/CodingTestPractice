package org.example.현대소프티어.금고털이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex {
    static class Jew{
        int weight;
        int price;

        public Jew(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Jew> list = new ArrayList<>();
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int weight = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        while (count > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int jewWeight = Integer.parseInt(st.nextToken());
            int jewPrice = Integer.parseInt(st.nextToken());
            Jew jew = new Jew(jewWeight, jewPrice);
            list.add(jew);
            count--;
        }
        list.sort((o1, o2) -> o2.price - o1.price);

        for (Jew jew : list) {
            if (weight < jew.weight) {
                result += jew.price * weight;
                weight=0;
                break;
            }
            result += jew.price * jew.weight;
            weight -= jew.weight;
        }

        System.out.println("result = " + result);
    }
}
