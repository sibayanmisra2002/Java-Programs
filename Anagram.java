import java.util.Arrays;
public class Anagram{
	public static boolean anagram(String s1, String s2){
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1,c2);
	}
	public static void main(String args[]){
		String s1="listen";
		String s2="silent";
		boolean a=anagram(s1,s2);
		System.out.println(s1+" and "+s2+" is Anagram= "+a);
	}
}
