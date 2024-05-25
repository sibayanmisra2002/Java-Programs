import java.util.*;

public class FindDuplicates {
    public static void main(String args[]) {
		String s="geeksforgeeks";
		HashSet<Character> set=new HashSet<>();
		HashSet<Character> dupli=new HashSet<>();
		for(char c:s.toCharArray()){
			if(!set.add(c))
				dupli.add(c);
		}
		
		for(char dup:dupli){
			System.out.print(dup+" ");
		}
	}
}
			