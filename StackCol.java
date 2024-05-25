import java.util.*;
public class StackCol{
	public static void main(String args[]){
	Stack<Integer> s=new Stack<>();
	s.push(1);
	s.push(2);
	s.push(3);
	
	int top=s.peek();
	System.out.println("Top element:"+top);
	System.out.println("Popped element:"+s.pop());
	System.out.println("Stack Size:"+s.size());
	System.out.println("Is stack empty?:"+s.isEmpty());
}
}
	