import java.util.*;
import java.util.ArrayList;
public class StringConcate{
	public static void main(String args[]){
		List<String> l=new ArrayList<>();
		l.add("java");
		l.add("is");
		l.add("fun");
		String d="-";
		String n=String.join(d,l);
		System.out.println(n);
		System.out.println(l.stream().findFirst().get());
	}
}