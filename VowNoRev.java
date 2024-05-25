public class VowNoRev {

    public static void main(String[] args) {
        String s = "Shreya";
        int c = 1;
        String n = "";
        String m = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                n = n + (char)(c + '0');
                c++;
            } else {
                n = n + ch;
            }
        }

        StringBuilder sb = new StringBuilder(n);
        m = sb.reverse().toString();

        System.out.println(m);
    }
}
