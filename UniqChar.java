import java.util.Set;
import java.util.HashSet;
public class UniqChar{
public static Set<Character> uni(String s){
	Set<Character> set= new HashSet<>();
	for(char c: s.toCharArray()){
		
			set.add(c);
	}
	return set;
}
public static void main (String args[]){
	String s="110234556";
	Set<Character> set=uni(s);
	System.out.println("Unique Characters="+set);
}
}