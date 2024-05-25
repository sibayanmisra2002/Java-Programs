import java.util.*;
public class RemoveStrSpace{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
	
		//s=s.replaceAll("[^a-zA-Z]","");
		s=s.replaceAll("[(){}]","");
		System.out.println(s);
		//for(int i=s.length()-1;i>=0;i--){
		//	rev=rev+s.charAt(i);
		//}
		//if(s.equals(rev))
		//System.out.println("Palindrome");
	//else
		//System.out.println("Not Palindrome");
	}
}