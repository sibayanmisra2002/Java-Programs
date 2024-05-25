import java.util.*;
public class AsciiValChar{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		if(c>='A' && c<='Z' || c>='a' && c<='z')
		System.out.println(c+ " is alphabet");
	else
		System.out.println(c+ " is not alphabet");
	
	}
}