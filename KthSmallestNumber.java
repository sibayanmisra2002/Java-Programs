import java.util.Arrays;


public class KthSmallestNumber {

    public static int findKthSmallest(int[] arr, int k) {
        
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 3, 6, 9, 7, 8};
        int k = 3;
        int kthSmallest = findKthSmallest(arr, k);
        System.out.println("The kth smallest number is: " + kthSmallest);
    }
}
