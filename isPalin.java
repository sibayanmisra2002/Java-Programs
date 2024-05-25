import java.util.*;
public class isPalin{
	public static void main(String args[]){
		int n=122;
		String s=Integer.toString(n);
		int l=0; int r=s.length()-1;
		while(l<=r){
			if(s.charAt(l)!=s.charAt(r)){
				System.out.println("Not Palindrome");
				return;
			}
			l++; r--;
		}
		System.out.println("Palindrome");
	}
}