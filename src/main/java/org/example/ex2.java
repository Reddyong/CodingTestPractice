package org.example;

import java.sql.Array;
import java.util.*;

public class ex2 {
    public Integer[] solution(String[] genres, int[] plays) {
        Integer[] answer = {};

        HashMap<String, List<Music>> map = new HashMap<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            String key = genres[i];
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            List<Music> value = map.get(key);
            value.add(new Music(plays[i], i));
        }
        // map :
        // pop = {{play = 600, index = 1}, {play = 2500, index = 4}}
        // classic = {{play = 500, index = 0}, {play = 150, index = 2}, {play = 800, index = 3}}

//        HashMap<String, Integer> sumMap = new HashMap<>();
//        for (String key : map.keySet()) {
//            int sum = 0;
//            List<Music> music = map.get(key);
//            for (int j = 0; j < music.size(); j++) {
//                Music music1 = music.get(j);
//                int play = music1.play;
//                sum += play;
//            }
//            sumMap.put(key, sum);
//        }
        // sumMap :
        // {pop = 3100, classic = 1450}



        List<List<Music>> list = new ArrayList<>();
        for (String key : map.keySet()) {
            System.out.println("key = " + key);
            List<Music> musicList = map.get(key);
            list.add(musicList);
        }
        list.sort(new Comparator<List<Music>>() {
            @Override
            public int compare(List<Music> o1, List<Music> o2) {
                return getPlaySum(o2) - getPlaySum(o1);
            }
        });

        for (List<Music> musicList : list) {
            if (musicList.size() == 1) { // 장르에 속한 곡이 한 개인 경우
                Music music = musicList.get(0);
                int index = music.index;
                answerList.add(index);
            }
            else {
                musicList.sort(new Comparator<Music>() {
                    @Override
                    public int compare(Music o1, Music o2) {
                        if (o1.play == o2.play) {
                            return o1.index - o2.index;
                        }
                        return o2.play - o1.play;
                    }
                });

                int count = 0;
                for (Music music : musicList) {
                    if (count == 2) {
                        break;
                    }
                    int index = music.index;

                    answerList.add(index);
                    count++;
                }
            }
        }


        Integer[] array = answerList.toArray(new Integer[answerList.size()]);
        answer = array;
        return answer;
    }

    public int getPlaySum(List<Music> list) {
        int sum = 0;
        for (Music music : list) {
            sum += music.play;
        }
        return sum;
    }

    public static void main(String[] args){
        ex2 sol = new ex2();
        Integer[] solution = sol.solution(new String[]{"classic", "pop", "classic", "classic", "pop", "a"}, new int[]{500, 600, 150, 800, 2500, 100});

        for (Integer integer : solution) {
            System.out.println("integer = " + integer);
        }
    }

}
