package cd.get.ready.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DogWalker {
    public int numberOfWalksCalculator(int[] dogSizes){

        Map<Integer, Integer> map = countOccurrences(dogSizes);


        return countWalks(map);
    }

    private Map<Integer,Integer> countOccurrences(int[] dogSizes) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int size: dogSizes) {
            addSizetoMap(map,size);
        }

        return map;
    }

    private void addSizetoMap(Map<Integer,Integer> map, int size) {
        if(map.containsKey(size)) {
            map.put(size,map.get(size)+1);
        } else {
            map.put(size,1);
        }
    }

    private int countWalks(Map<Integer,Integer> map) {
        int numberOfWalks = 0;

        for(int dogs : map.values()) {
            numberOfWalks += Math.ceil(dogs/2.0f);
        }

        return numberOfWalks;
    }
}
