package org.example;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {

        HashMap<String, List<Integer>> mapPlay = new HashMap<>();
        HashMap<String, List<Integer>> mapIndex = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String key = genres[i];
            int valuePlay = plays[i];
            int valueIndex = i;
            if (!mapPlay.containsKey(genres[i])) {
                mapPlay.put(key, new ArrayList<>());
                mapIndex.put(key, new ArrayList<>());
            }
            List<Integer> valuesPlay = mapPlay.get(key);
            List<Integer> valuesIndex = mapIndex.get(key);
            valuesPlay.add(valuePlay);
            valuesIndex.add(valueIndex);
        }
        System.out.println("mapPlay = " + mapPlay);
        System.out.println("mapIndex = " + mapIndex);

        HashMap<String, Integer> sumMap = new HashMap<>();
        for (String s : mapIndex.keySet()) {
            int sum = 0;
            List<Integer> keyPlay = mapPlay.get(s);
            for (int j = 0; j < keyPlay.size(); j++) {
                sum += keyPlay.get(j);
            }
            sumMap.put(s, sum);
        }

        System.out.println("sumMap = " + sumMap);

        List<Map.Entry<String, Integer>> sumList = new ArrayList<>(sumMap.entrySet());
        sumList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        for (Map.Entry<String, Integer> s : sumList) {
            System.out.println("s = " + s);
        }

        List<Integer> fanswer = new ArrayList<>();
        for (Map.Entry<String, Integer> sumEntry : sumList) {  // sumList = pop=3100, classic = 1450
            // sumEntry = pop=3100
            List<Integer> indexList = mapIndex.get(sumEntry.getKey()); // 1,4
            List<Integer> playList = mapPlay.get(sumEntry.getKey());// 600,2500
            HashMap<Integer, Integer> newMap = new HashMap<>();
            for (int a = 0; a < playList.size(); a++) {
                newMap.put(playList.get(a), indexList.get(a));
            }
            // newMap -> 600=1, 2500=4
            List<Integer> keySet = new ArrayList<>(newMap.keySet());
            System.out.println("keySet = " + keySet);
//            Collections.reverse(keySet);
//            System.out.println("keySet = " + keySet);
            for (Integer played : keySet) {
                fanswer.add(newMap.get(played));
            }
        }

        for (Integer integer : fanswer) {
            System.out.println("integer = " + integer);
        }

        int[] answer = {0};

        return answer;
    }

    public static void main(String[] args){
        BestAlbum ba = new BestAlbum();
        int[] solution = ba.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});

    }
}
