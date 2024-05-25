import java.util.*;
public class MoveHyphen{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();

		StringBuilder hyphens=new StringBuilder();
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			
			if(ch=='-')
				hyphens.append(ch);
			else
				result.append(ch);
		}
		String res=hyphens.toString()+result.toString();
		System.out.println(res);
	}
}
		
		
