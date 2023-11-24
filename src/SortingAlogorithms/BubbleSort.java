package SortingAlogorithms;

//Time Complexity: O(N2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] A = {1, 9, 0, 100, 10, 24, 10, 2, 1, 5};
        bubble(A);

        for (int i : A) {
            System.out.println(i);
        }
    }

    private static void bubble(int[] a) {
        int n = a.length;

        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
        }
    }
}
