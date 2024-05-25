import java.util.*;
public class SumOfMinMax{
	public static void main(String args[]){
		int a[]={12,1234,45,67,1};
		Arrays.sort(a);
		int mini=a[0];
		int maxi=a[a.length-1];
		int sum=mini+maxi;
		
		System.out.println("Sum="+sum);
	}
}
