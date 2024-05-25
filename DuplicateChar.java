import java.util.Set;
import java.util.HashSet;
public class DuplicateChar{
public static Set<Character> duplicate(String s){
	Set<Character> set= new HashSet<>();
	Set<Character> dupli= new HashSet<>();
	for(char c: s.toCharArray()){
		if(!set.contains(c))
			set.add(c);
		else
			dupli.add(c);
	}
	return dupli;
}
public static void main (String args[]){
	String s="geeksforgeeks";
	Set<Character> set=duplicate(s);
	System.out.println("Duplicate Characters="+set);
}
}