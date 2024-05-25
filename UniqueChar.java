import java.util.Set;
import java.util.HashSet;
public class UniqueChar{
public static Set<Character> unique(String s){
	Set<Character> set= new HashSet<>();
	for(char c: s.toCharArray()){
		if(!set.contains(c))
			set.add(c);
	}
	return set;
}
public static void main (String args[]){
	String s="Hello";
	Set<Character> set=unique(s);
	System.out.println("Unique Characters="+set);
}
}