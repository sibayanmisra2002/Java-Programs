import java.util.*;

public class CountDistinctEle {
    public static void main(String args[]) {
		int a[]={2,3,4,4,6,7,7,1};
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}
		System.out.println("Number of elements are: "+set);
		System.out.println("Number of elements are: "+set.size());
	}
}
				