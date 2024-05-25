import java.util.*;
public class ValidPassword{
	public static int CheckPass(String s){
		
		if(s.length()<4)
			return 0;
		
		if(Character.isDigit(s.charAt(0)))
			return 0;
		
		
		boolean hasDigit=false;
		boolean hasCapital=false;
		
		for(char c:s.toCharArray()){
			if(c==' ' || c=='/')
				return 0;
			else if(Character.isDigit(c))
				hasDigit=true;
			else if(Character.isUpperCase(c))
				hasCapital=true;
		}
		if(hasDigit && hasCapital)
		return 1;
	else 
		return 0;
	}

	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		System.out.println("Input 1:");
		String s1=in.nextLine();
		System.out.println("Input 2:");
		String s2=in.nextLine();
		System.out.println("Output 1:");
		System.out.println(CheckPass(s1));
		System.out.println("Output 2:");
		System.out.println(CheckPass(s2));
	}
}

		
			
			