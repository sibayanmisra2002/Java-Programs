import java.util.*;
public class DiffOfSum{
	
	public static int differenceofSum(int n, int m){
		int sum=0, sum2=0;int diff=0;
		for(int i=1;i<=m;i++)
		{
			if(i%n==0){
				sum+=i;
			}
			else
			sum2+=i;
		
		diff=sum2-sum;
		}
			
			return diff;
		
	}

	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		System.out.print("n:");
		int n=in.nextInt();
		System.out.print("m:");
		int m=in.nextInt();
		int output=differenceofSum(n,m);
		System.out.println(output);
	}
}
		