import java.util.*;

public class EvenOdd {
    public static int LargeSmallSum(int[] arr, int size) {
        if (size <= 3) return 0;
        int[] arr1 = new int[size / 2];
        int[] arr2 = new int[size / 2];
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                arr1[i / 2] = arr[i];
            } else {
                arr2[i / 2] = arr[i];
            }
        }
        int size1 = arr1.length;
        int size2 = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return arr1[size1 - 2] + arr2[size2 - 2];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("arr:");
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }

        int size = arr.length;
        System.out.println(LargeSmallSum(arr, size));
    }
}
