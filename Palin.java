public class Palin{
	public static void main(String args[]){
		String s="mom";
		int l=0, r=s.length()-1;
		boolean isPalin=true;
		while(l<=r){
			if(s.charAt(l)!=s.charAt(r)){
				isPalin=false;
			}
			l++; r--;
		}
		isPalin=true;
		
		if(isPalin==true){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}

