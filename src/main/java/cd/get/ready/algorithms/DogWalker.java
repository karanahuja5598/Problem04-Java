package cd.get.ready.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DogWalker {
    public int numberOfWalksCalculator(int[] dogSizes){
        int numberOfWalks = 0;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < dogSizes.length; i++) {
            map.merge(dogSizes[i], 1, Integer::sum);
        }

        for (Integer i : map.values())
            if(i % 2 == 0) {
                int result = i / 2;
                numberOfWalks += result;
            } else if (i == 1) {
                numberOfWalks++;
            } else if(i % 2 != 0 && (i - 1) % 2 == 0) {
                int result1 = i / 2;
                numberOfWalks += result1 + 1;
            }

        return numberOfWalks;
    }
}
