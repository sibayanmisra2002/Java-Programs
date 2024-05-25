import java.util.*;
public class RemoveArrDup{
	public static void main(String args[]){
		int a[]={3,3,2,2,1,1,6};
		int k=remove(a);
		System.out.println("After removing duplicate:");
		for(int i=0;i<k;i++){
			System.out.print(a[i]+"");
		}
	}
	public static int remove(int a[]){
		Arrays.sort(a);
		int i=0;
		for(int j=1;j<a.length;j++){
			if(a[i]!=a[j]){
				 i++;
			     a[i]=a[j];
			}
		}
		return i+1;
	}
}
			
			
			
			