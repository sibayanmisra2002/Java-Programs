import java.util.*;
public class Fibo{
	public static void fibo(int n){
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
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=in.nextInt();
		System.out.println("Fibonacci series upto "+n+" :");
		fibo(n);
		
	}
}
