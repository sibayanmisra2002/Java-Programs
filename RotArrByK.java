import java.util.*;

public class RotArrByK {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int k = in.nextInt(); 

        RotArrByK solution = new RotArrByK(); 
        solution.rotate(a, k);

       
        System.out.print("Rotated Array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public void rotate(int a[], int k) {
        k = k % a.length;
        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
    }

    public void reverse(int a[], int l, int r) {
        while (l < r) {
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
    }
}
