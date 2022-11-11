import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] a = {9,2,4,6,1,3,10};
        InsertionSort.sort(a);
        System.out.println("after sorting: " + Arrays.toString(a));
    }
}