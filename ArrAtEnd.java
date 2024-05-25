import java.util.*;
public class ArrAtEnd{
	public static void main(String args[]){
		int a[]={1,2,3,4};
		int newEle=5;
		int newArr[]=new int[a.length+1];
		for(int i=0;i<a.length;i++){
			newArr[i]=a[i];
		}
		newArr[newArr.length-1]=newEle;
		
		System.out.println("Original Array: "+Arrays.toString(a));
		System.out.println("New Array: "+Arrays.toString(newArr));
	}
}