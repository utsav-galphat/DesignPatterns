package BinarySearch;

import java.util.Arrays;

abstract public class AggCow {
    static int  a = 0;
    public static void main(String[] args) {
//        System.out.println(solve(new int[]{82,61,38,88,12,7,6,12,48,8,31,90,35,5,88,2,66,19,5,96,84,95},8));
        System.out.println(a + solve1(new int[]{1,1,1,1,1,1,1,1,1,1},0));
    }
    public static int solve(int[] A, int B) {
        int max = A[0];
        int min = A[0];
        int n = A.length;
        int low = 0;

        int ans=0;
        for(int i=1; i<n; i++){
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        int high = max - min;
        while(low<=high){
            int mid = (low+high)/2;

            if(check(n,A,B,mid)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }

    public static boolean check(int n, int[] A, int B, int dist){
        int count = 1;
        int last = A[0];

        for(int i=1; i<n; i++){
            if(A[i]-last >= dist){
                count++;
                last = A[i];
            }
        }

        if(count>=B){
            return true;
        }
        else
            return false;
    }

    public static int solve1(int[] A, int B) {
        int count = 0;
        Arrays.sort(A);
        int i = 0;
        int j = 1;

        while(j<A.length){

            if(A[i]-A[j]==B){
                System.out.println(i+" "+ j);
                count++;
                i++;
                j++;
            }
            else if(A[i]-A[j]<B)
                j++;
            else
                i++;

        }
        return count;
    }
}
