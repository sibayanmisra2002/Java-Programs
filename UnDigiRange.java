import java.util.HashSet;

public class UnDigiRange {
    public static void main(String[] args) {
        int n = 10;
        int m = 20;

        System.out.println("Numbers between " + n + " and " + m + " with unique digits:");

        for (int i = n; i <= m; i++) {
            if (hasUniqueDigits(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean hasUniqueDigits(int num) {
        String numStr = String.valueOf(num);
        HashSet<Character> digitSet = new HashSet<>();

        for (char digit : numStr.toCharArray()) {
            if (digitSet.contains(digit)) {
                return false;
            }
            digitSet.add(digit);
        }

        return true;
    }
}
