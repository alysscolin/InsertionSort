/* the left part of this array is always sorted! */

public class InsertionSort {
    public static void sort(int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int x = arr[i+1];
            for (int j = i; j >= 0; j--) {
                if (x < arr[j]) {
                    arr[j+1] = arr[j];
                    arr[j] = x;
                } else {
                    break;
                }
            }
        }
    }
}
