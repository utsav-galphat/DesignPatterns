package SortingAlogorithms;

public class QuickSort {
    public static void main(String[] args){
        int[] A = {1,4,10,2,1,5};
        quick(A, 0, A.length-1);
    }

    public static void quick(int[] A, int start, int end){
        if(start>=end){
            return;
        }

        int pi = partition(A, start, end);

        quick(A, start, pi-1);
        quick(A, pi+1, end);
    }

    public static int partition(int[] A, int start, int end){
        int pivot = A[end];
        int i=start;

        for(int j=start; j<end; j++){
            if(A[j]<pivot){
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
                i++;
            }
        }

        A[end] = A[i];
        A[i] = pivot;
        return i;
    }
}


