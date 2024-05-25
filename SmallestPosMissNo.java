import java.util.*;
public class SmallestPosMissNo{
	public static void main(String args[]){
		int a[]={1,3,4,0,-2,-4};
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				set.add(a[i]);
			}
		}
		
		int small=1;
		while(set.contains(small)){
			small++;
		}
		
		System.out.println("Smallest Positive missing number is: "+small);
	}
}

