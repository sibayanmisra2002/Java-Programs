public class Palindrome{
	public static boolean palin(int n){
		int r=0;
	
		while(n>0){
			r=r*10+(n%10);
			n=n/10;
		}
		if(n==r)
			return true;
		else
			return false;
	}
	public static void main(String args[]){
		int min=100;
		int max=200;
		for(int i=min;i<=max;i++){
			if(palin(i)){
				System.out.print(i+" ");
			}
		}
	}
}
				
			
			
			
		
