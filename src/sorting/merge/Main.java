package sorting.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> unsorted = new ArrayList<>(Arrays.asList(9, 2, 4, 5, 1, 9, 3, 6));

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        MergeSort ms = new MergeSort(unsorted, executorService);
        ArrayList<Integer> sorted = ms.call();
        System.out.print(sorted);
        executorService.shutdown();
    }
}
