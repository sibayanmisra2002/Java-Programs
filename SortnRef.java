import java.util.*;

public class SortnRef {
    public static List<Integer> SortnReplaceFunc(List<Integer> A, List<Integer> B, int n) {
        int sp = 0;
        int al = A.size();
        for (int i = 0; i < al; i++) {
            int mini = i;
            for (int j = i + 1; j < A_len; j++) {
                if (A.get(j) < A.get(mini)) {
                    mini = j;
                }
            }
            int tA = A.get(i);
            int tB = B.get(i);
            A.set(i, A.get(mini));
            B.set(i, B.get(mini));
            A.set(mini, tA);
            B.set(mini, tB);
            sp++;
            if (sp == n) {
                break;
            }
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> A = new ArrayList<>();
        while (in.hasNextInt()) {
            int no = in.nextInt();
            A.add(no);
            if (in.hasNextLine()) {
                break;
            }
        }
        List<Integer> B = new ArrayList<>();
        while (in.hasNextInt()) {
            int no = in.nextInt();
            B.add(no);
            if (in.hasNextLine()) {
                break;
            }
        }
        int n = in.nextInt();
        List<Integer> rB = SortAndReplace(A, B, n);
        int rBl = rB.size();
        for (int i = 0; i < rBl; i++) {
            System.out.print(rB.get(i) + " ");
        }
    }
}