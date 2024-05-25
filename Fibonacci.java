public class Fibonacci{
	public static void main(String args[]){
		int n=100;
		int first=0;
		int second=1;
		System.out.print(first+" ");
		while(first<=n){
			System.out.print(second+" ");
			int next=first+second;
			first=second;
			second=next;
		}
		
	}
}