import java.util.*;
public class ReverseNumber {
    public static void main(String args[]) {
     Scanner in =new Scanner(System.in);
	 String s=in.nextLine();
		int len=s.length();
		for(int i=len-1;i>=0;i--){
			char c=s.charAt(i);
			System.out.print(c);
		}

    }
}