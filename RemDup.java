import java.util.*;
public class RemDup{
	public static void main(String args[]){
		String s="aabbccdd";
		HashSet<Character> set=new HashSet<>();
		for(char c:s.toCharArray()){
			if(!set.contains(c)){
				set.add(c);
			}
		}
		StringBuilder uni = new StringBuilder();
		for(char c:set){
			uni.append(c);
		}
		System.out.println(uni.toString());
	}
}
		
	
