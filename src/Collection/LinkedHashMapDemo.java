package Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String args[]) {



        HashMap<String, Integer> stocks = new LinkedHashMap<>(16, 0.75f, true);


        stocks.put("Apple", 123);

        stocks.put("BMW", 54);

        stocks.put("Google", 87);

        stocks.put("Microsoft", 232);

        stocks.put("Oracle", 76);



        stocks.get("Google");

        stocks.get("BMW");



        System.out.println(stocks);
        int[] numbers = {1, 5, 4, 6, 7, 8, 9, 10, 11};


        System.out.println(Arrays.binarySearch(numbers, 4));
    }
}
