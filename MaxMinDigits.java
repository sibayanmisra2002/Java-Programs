public class MaxMinDigits{
	public static void main(String args[]){
		int n=345;
		int d;
		int mini=Integer.MAX_VALUE;
		int maxi=Integer.MIN_VALUE;
		while(n>0){
			d=n%10;
			mini=Math.min(mini,d);
			maxi=Math.max(maxi,d);
			n=n/10;
		}
		System.out.println("Minimum "+mini);
		System.out.println("Maximum "+maxi);
	}
}
