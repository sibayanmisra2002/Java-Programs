public class LenNoString {
  public static void main(String[] args) {
    String s = "5ithink";
    int ch = s.charAt(0)-'0';
    s = s.substring(1);
    int len = s.length();

    if (ch == len) {
      System.out.println("TRUE " + len);
    } else {
      System.out.println("FALSE " + len);
    }
  }
}