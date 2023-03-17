package edu.sulima;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task4 {
    public static Integer countPairs(List<Integer> array, Integer target){
        HashMap<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        for(Integer el: array){
            if(el <= target){
                frequencyMap.put(el, frequencyMap.getOrDefault(el, 0) + 1);
            }
        }

        Integer pairsAmount = 0;
        for(Map.Entry<Integer, Integer> set :
                frequencyMap.entrySet()){
            if(frequencyMap.containsKey(target - set.getKey())){
                pairsAmount += set.getValue() * frequencyMap.get(target - set.getKey());
            }
        }

        return pairsAmount / 2;
    }

    public static Long countPairsStream(List<Integer> array, Integer target){
        return array.stream()
                .flatMap(i -> array.stream()
                        .filter(j -> !i.equals(j) && i + j == target)
                        .map(j -> i + " + " + j + " = " + target))
                .count()/2;
    }
}
