import java.util.*;
public class MissingNoDup{
	public static void main(String args[]){
		int a[]={5,2,4,2,3};
		int n=a.length; int s=0;
		HashSet <Integer> set=new HashSet <>();
		for(int i=0;i<a.length;i++){
				set.add(a[i]);
		}
		for(int i=1;i<=n;i++){
			if(!set.contains(i)){
				System.out.println("Missing No: "+i);
			}
			
		}
	}
}
		
		
			
			
				
		
