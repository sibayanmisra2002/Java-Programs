import java.util.List;
import java.util.ArrayList;
public class Words{
	public static void main (String args[]){
		String s="the sky is blue";
		
		String w[]= s.split(" ");
		List <String> noVowel=new ArrayList<>();
		
		for(String word:w){
			
			boolean hasVowel=false;
			
			for(char ch: word.toCharArray()){
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				hasVowel=true;
				break;
			}
			}
			if(!hasVowel){
				noVowel.add(word);
			}
		}
	for(String word:noVowel){
		System.out.println(word);
		
		}
	}
}

		
