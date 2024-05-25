import java.util.*;

public class RemoveArrayDup {

  public static void main(String[] args) {
    String str = "geeksforgeeks";
    char[] arr = str.toCharArray();
    HashSet<Character> set = new HashSet<>();
    int n = arr.length;
    int j = 0;
    for (int i = 0; i < n; i++) {
      if (!set.contains(arr[i])) {
        set.add(arr[i]);
        arr[j++] = arr[i];
      }
    }
    char[] result = new char[j];
    for (int i = 0; i < j; i++) {
      result[i] = arr[i];
    }
    System.out.println(new String(result));
  }
}
