import java.util.Scanner;

public class CountArr {
    public static int findCount(int[] arr, int length, int num, int diff) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (Math.abs(num - arr[i]) <= 2) {
                count++;
            }
        }
        if (count == 0) {
            return -1;
        } else {
            return count;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.print("arr: ");
        for (int i = 0; i < 6; i++) {
            arr[i] = scanner.nextInt();
        }
        int num, diff;
        System.out.print("num: ");
        num = scanner.nextInt();
        System.out.print("diff: ");
        diff = scanner.nextInt();
        int length = arr.length;
        System.out.println(findCount(arr, length, num, diff));
    }
}

