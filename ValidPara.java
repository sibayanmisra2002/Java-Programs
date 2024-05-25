import java.util.*;
public class ValidPara{
	public static void main(String args[]){
		String s = "HELLO AND (WELCOME (TO THE) TCEA (CONTEST)TODAY) IS (SATURDAY()";
		Stack <Character> stack=new Stack<>();
		for(char ch: s.toCharArray()){
			if(ch=='('){
				stack.push('(');
			}
			else if(ch==')'){
				if(stack.isEmpty()){
					System.out.println(1);
					return ;
				}
				stack.pop();
			}
		}
		if(stack.isEmpty()){
			System.out.println(0);
		}
		else{
			System.out.println(1);
		}
	}
}
			
				
