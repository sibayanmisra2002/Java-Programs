import java.util.*;
public class ArrDigitSum{
	public static void main(String args[]){
	int a[]={6,5,8,3};
	int s=0;
	int l=0;
	int r=a.length-1;
	while(l<=r){
		if(l==r){
			s+=a[l];
			break;
		}
		s+=a[l]*10+a[r];
		l++;
		r--;
	}
	System.out.println("Sum: "+s);
}
}

			
