package org.example.fastcampus.Lv1.가장많이받은선물;

public class ex {
    int[][] checkGift;
    int[] giftNum;
    int[] ansArr;
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        init(friends, gifts);
        return answer;
    }

    private void init(String[] friends, String[] gifts) {
        checkGift = new int[friends.length][friends.length];
        giftNum = new int[friends.length];
        ansArr = new int[friends.length];

        for (String gift : gifts) {
            String[] split = gift.split(" ");
            String give = split[0];
            String receive = split[1];

            putGiftInfo(give, receive, friends);
        }

        putNumInfo();
    }

    private void putNumInfo() {
        for (int i = 0; i < giftNum.length; i++) {
            giftNum[i] = getNumInfo(i);
        }
    }

    private int getNumInfo(int idx) {
        int give = 0;
        int receive = 0;

        for (int i = 0; i < giftNum.length; i++) {
            give += checkGift[idx][i];
            receive += checkGift[i][idx];
        }

        return give - receive;
    }

    private void putGiftInfo(String give, String receive, String[] friends) {
        int gIndex = 0;
        int rIndex = 0;

        for (int i = 0; i < friends.length; i++) {
            if (friends[i].equals(give)) {
                gIndex = i;
            } else if (friends[i].equals(receive)) {
                rIndex = i;
            }
        }

        checkGift[gIndex][rIndex]++;
    }

    public static void main(String[] args) {
        ex sol = new ex();
        int solution1 = sol.solution(new String[]{"muzi", "ryan", "frodo", "neo"}, new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"});
        int solution2 = sol.solution(new String[]{"joy", "brad", "alessandro", "conan", "david"}, new String[]{"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"});
        int solution3 = sol.solution(new String[]{"a", "b", "c"}, new String[]{"a b", "b a", "c a", "a c", "a c", "c a"});

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }
}
