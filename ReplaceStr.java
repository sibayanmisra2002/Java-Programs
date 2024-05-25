import java.util.*;
public class ReplaceStr{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String repl=in.nextLine();
		String nw=in.nextLine();
		
		String res=s.replace(repl,nw);
		System.out.println(res);
	}
}
		