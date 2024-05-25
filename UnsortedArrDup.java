import java.util.*;
public class UnsortedArrDup{
	public static void remove(int a[], int n){
		HashMap <Integer, Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++){
			if(!map.containsKey(a[i])){
				System.out.print(a[i]+" ");
				map.put(a[i],1);
			}
		}
	}
	public static void main(String args[]){
		int a[]={3,3,1,1,2,2,6,0};
		int n=8;
		remove(a,n);
	}
}