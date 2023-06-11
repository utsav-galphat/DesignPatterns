package BinarySearch;

public class Solution {
    public static void main(String[] args) {
        int[] a = {1,7,67,133,178};
        System.out.println(search(a,1));
    }
    public static int solve(int[] A) {
        int l = 0;
        int r = A.length-1;
        // return A[0] if array length is 1
        if (r+1 == 1) {
            return A[0];
        }

        // return A[0] when A[0] is single element
        if (A[0] != A[1]) {
            return A[0];
        }

        while(l<=r){
            int mid = (l+r)/2;

            if((mid==0 || A[mid-1]!=A[mid]) && (mid==A.length-1 || A[mid]!=A[mid+1]))
                return A[mid];

            else if(mid !=0 && A[mid]== A[mid-1]){
                if(mid%2==0)
                    r=mid-1;
                else
                    l=mid+1;
            }
            else{
                if(mid%2==0)
                    l=mid+1;
                else
                    r=mid-1;
            }
        }
        return -1;
    }
    public static int solve1(int[] A) {
        int l = 0;
        int r = A.length-1;
        while(l<=r){
            int mid = (l+r)/2;

            if((mid==0 || A[mid]>=A[mid-1]) && (mid==A.length-1||A[mid]>=A[mid+1])){
                return A[mid];
            }

            else if(mid==0 || A[mid]>A[mid-1])
                l = mid+1;

            else
                r = mid-1;
        }
        return -1;
    }

    public static int[] searchRange(final int[] A, int B) {
        int l = 0;
        int r = A.length-1;
        int first=-1;
        int last=-1;
        if(A.length==1){
            int[] res = {0,0};
            return res;
        }

        while(l<=r){
            int mid = (l+r)/2;

            if(A[mid]==B){
                if(mid==0||A[mid]!=A[mid-1]){
                    first=mid;
                    l=mid+1;
                }

                else
                    r = mid-1;
            }
            else if(A[mid]<B){
                l=mid+1;
            }
            else
                r=mid-1;
        }
        l = 0;
        r = A.length-1;
        while(l<=r){
            int mid = (l+r)/2;


            if(A[mid]==B){
                if(mid==A.length-1||A[mid]!=A[mid+1]){
                    last=mid;
                    r=mid-1;
                }

                else
                    l = mid+1;
            }
            else if(A[mid]>B){
                r=mid-1;
            }
            else
                l=mid+1;
        }

        int[] res = {first,last};
        return res;
    }

    public static int search(final int[] A, int B) {

        int l = 0;
        int n = A.length-1;
        int r = A.length-1;

        while(l<=r){
            int mid = (l+r)/2;

            if(A[mid]==B)
                return mid;

            if(B<A[0]){
                if(A[mid]>=A[0]){
                    l = mid+1;
                }
                else
                if(A[mid]<B)
                    l=mid+1;
                else
                    r = r-1;
            }
            else{
                if(A[mid]<A[0]){
                    r = mid-1;
                }
                else
                if(A[mid]<B)
                    l=mid+1;
                else
                    r = r-1;
            }
        }
        return -1;

    }
}

