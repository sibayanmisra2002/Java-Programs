import java.util.*;

public class GCD {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int res = findGCD(Math.abs(a), Math.abs(b));
        System.out.println(res);
    }

    public static int findGCD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a != 0)
            return a;
        else
            return b;
    }
}
