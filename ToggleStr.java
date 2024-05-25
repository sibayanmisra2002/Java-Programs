import java.util.*;
public class ToggleStr{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		
		StringBuilder sb=new StringBuilder();
		
		for(char c:s.toCharArray()){
			if(Character.isUpperCase(c))
				sb.append(Character.toLowerCase(c));
				else if(Character.isLowerCase(c))
					sb.append(Character.toUpperCase(c));
				else
					sb.append(c);
		}
		
		System.out.println(sb.toString());
	}
}