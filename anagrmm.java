import java.util.*;
public class anagrmm{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean res=Arrays.equals(c1,c2);
		if(res == true)
			System.out.println(s1 + " & " + s2+" are anagram");
		else
			System.out.println(s1 + " & " + s2+" are not anagram");
	}
}