public class StringSubSeq{
	
	public static boolean seq(String a, String b){
		int i=0,j=0;
		while(i<a.length() && j<b.length()){
		
			if(a.charAt(i)== b.charAt(j)){
				i++;
				j++;
			}
			else{
				i++;
			}
		}
		return j==b.length();
	}

	public static void main(String args[]){
		
		String a="abcde";
		String b="ace";
		
		boolean seq=seq(a,b);
		if(seq){
			System.out.println(b+" is a Subsequence of "+ a);
		}
			else
			{
				System.out.println(b+" is not a Subsequence of "+ a);
		}
	}
	
}		
