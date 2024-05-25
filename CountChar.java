import java.util.*;
public class CountChar{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int count=0;
		String s="Java is fun";
		System.out.println("Enter char to be found: ");
		char c=in.next().charAt(0);
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(c==ch){
				count++;
			}
		}
		System.out.println("Character count: "+count );
	}
}

		
				
		

