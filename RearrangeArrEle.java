import java.util.*;

public class RearrangeArrEle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        // Fix the loop condition here (use i < n)
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int res[] = new int[n];
        int pos = 0;
        int neg = 1;

        // Fix the loop condition here (use i < n)
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                res[pos] = a[i];
                pos += 2;
            } else {
                res[neg] = a[i];
                neg += 2;
            }
        }

        // Print the rearranged array
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
