package BinarySearch;

public class PaintersProblem {
    public static void main(String[] args) {
        System.out.println(paint(9, 10, new int[]{904, 531, 64, 992, 522, 850, 639}));
    }

    public static int paint(int A, int B, int[] C) {
        int n = C.length;
        long low = 0;
        long high = 0;
        int mod = 10000003;
        for (int i = 0; i < n; i++) {
            high += (long) C[i] * B;
            low = Math.max(low, (long) C[i] * B);
        }
        long ans = 0;
        while (low <= high) {
            long mid = (low + high) / 2;

            if (check(A, mid, B, C)){
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;

        }
        return (int) (ans % mod);
    }

    public static boolean check(int A, long X, long unit, int[] C) {
        int currentWorker=1;
        long sum = 0;

        for(int i=0; i<C.length; i++){
            sum = sum + C[i]*unit;

            if(sum>X){
                sum=C[i]*unit;
                currentWorker++;
                if(currentWorker>A)
                    return false;
            }
        }
        return true;
    }
}

