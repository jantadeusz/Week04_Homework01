package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRadom {

    public static void main(String[] args) {
        Map<Integer, Integer> map = checkRand(500000, 10);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> checkRand(int amount, int interval) {
        int count = 0;
        Random generator = new Random();
        Map<Integer, Integer> result = new HashMap<>();
        // create map with values = zeros
        for (int i = 0; i < interval; i++) {
            result.put(i, 0);
        }
        // incrememt values every time random num equals key
        for (int j = 0; j < amount; j++) {
            int num = generator.nextInt(interval);
            result.put(num, result.get(num) + 1);
        }
        return result;
    }

}
