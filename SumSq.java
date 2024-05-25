import java.util.*;
public class SumSq{

	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		int no=in.nextInt();
		int n=in.nextInt();
		int m=in.nextInt();
		int first=square(n);
		int second=square(m);
		System.out.println(square(n));
		System.out.println(square(m));
	
	}
	public static int square(int n){
		int smsq=0, sum=0;
		for(int i=1;i<=n;i++){
			smsq+=i*i;
			sum=sum+i;
		}
		double d=Math.pow(sum,2);
		int res=(int) d;
		int result=res-smsq;
		
		return result;
}
}
			