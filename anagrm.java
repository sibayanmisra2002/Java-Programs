import java.util.*;
public class anagrm{
	public static void main(String args[]){
		String s1="java"; String s2="hello";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean res=Arrays.equals(c1,c2);
		if(res == true){
			System.out.println("Anagram");
		}
			else
				System.out.println("Not Anagram");
	}
}