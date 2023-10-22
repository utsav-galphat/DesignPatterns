package sorting.merge;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<ArrayList<Integer>> {
    ExecutorService executorService;
    ArrayList<Integer> arrayToBeSorted;

    MergeSort(ArrayList<Integer> arrayToBeSorted, ExecutorService executorService){
        this.executorService = executorService;
        this.arrayToBeSorted = arrayToBeSorted;
    }
    @Override
    public ArrayList<Integer> call() throws Exception {
        if(arrayToBeSorted.size() <=1)
            return arrayToBeSorted;

        int mid = arrayToBeSorted.size() /2;
        System.out.println(arrayToBeSorted + " running on " + Thread.currentThread().getName());
        ArrayList<Integer> leftArrayList = new ArrayList<>();
        ArrayList<Integer> rightArrayList = new ArrayList<>();

        for(int i=0; i<mid; i++) leftArrayList.add(arrayToBeSorted.get(i));
        for(int i=mid; i<arrayToBeSorted.size(); i++) rightArrayList.add(arrayToBeSorted.get(i));

        MergeSort left = new MergeSort(leftArrayList,executorService);
        MergeSort right = new MergeSort(rightArrayList, executorService);


        //pass it to executor service instead

//        ArrayList<Integer> sortedLeft = left.call();
//        ArrayList<Integer> sortedRight = right.call();

        Future<ArrayList<Integer>> futureSortedLeft = executorService.submit(left);
        Future<ArrayList<Integer>> futureSortedRight = executorService.submit(right);

        ArrayList<Integer> sortedLeft = futureSortedLeft.get();
        ArrayList<Integer> sortedRight = futureSortedRight.get();

        int i=0; int j=0;
        int l = sortedLeft.size(); int r = sortedRight.size();

        ArrayList<Integer> mergedList = new ArrayList<>();

        while(i<l && j<r){
            if(sortedLeft.get(i)< sortedRight.get(j)){
                mergedList.add((sortedLeft.get(i)));
                i++;
            }
            else {
                mergedList.add(sortedRight.get(j));
                j++;
            }
        }
        while(i<l){
            mergedList.add(sortedLeft.get(i));
            i++;
        }

        while(j<r){
            mergedList.add(sortedRight.get(j));
            j++;
        }

        return mergedList;
    }
}
