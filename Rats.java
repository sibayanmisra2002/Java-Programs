import java.util.Scanner;

public class Rats {
    public static int calcSuff(int[] arr, int size, int requiredFood) {
        if (size == 0) {
            return -1;
        }
        int sum = 0, count = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
            if (sum >= requiredFood) {
                ++count;
                return count;
            } else {
                ++count;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, unit, n;
        System.out.print("r: ");
        r = scanner.nextInt();
        System.out.print("unit: ");
        unit = scanner.nextInt();
        System.out.print("n: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(calcSuff(arr, n, r * unit));
    }
}

