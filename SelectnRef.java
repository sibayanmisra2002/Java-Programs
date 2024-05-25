import java.util.Scanner;

public class SelectnRef {
    public static void selectionSort(int[] A, int[] B, int n) {
        for (int i = 0; i < n; i++) {
            int mini = i;
            for (int j = i + 1; j < arrA.length; j++) {
                if (A[j] < A[mini]) {
                    mini = j;
                }
            }
            
            int tA = A[i];
            A[i] = A[mini];
            A[mini] = tA;
            
            int tB = B[i];
            B[i] = B[mini];
            B[mini] = tB;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] A = new int[in.nextInt()];
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }
        
        int[] B = new int[in.nextInt()];
        for (int i = 0; i < B.length; i++) {
            B[i] = in.nextInt();
        }
        
        int n = .nextInt();
        
        selectionSort(arrA, arrB, n);
        
        for (int i = 0; i < arrB.length; i++) {
            System.out.print(arrB[i] + " ");
        }
    }
}