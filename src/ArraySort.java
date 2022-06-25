import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] num = { 1567, 254, 10, 9999, 23, 18, 2589, 4444, 787, 10001, 102 };
        System.out.print("tablica orig:\n");
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.print("\npo posortowaniu:\n");
        System.out.println(Arrays.toString(num));
    }
}
