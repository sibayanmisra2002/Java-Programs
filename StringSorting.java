import java.util.Arrays;
public class StringSorting {
    public static String bubble(String s) {
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j] > a[j + 1]) {

                    char c = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = c;
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }
        return new String(a);
    }

    public static void main(String args[]) {
        String s = "ababa";
        System.out.println(bubble(s));
    }
}
