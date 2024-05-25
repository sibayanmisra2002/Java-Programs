import java.util.*;

public class MaxProfit {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
		int res=maxpro(a);
		System.out.println(res);
	}
	
	public static int maxpro(int p[]){
		int minprice=p[0];
		int maxprice=0;
		if(p==null || p.length<=1)
			return 0;
		
		for(int i=1;i<p.length;i++){
		minprice=Math.min(minprice, p[i]);
		maxprice=Math.max(maxprice, p[i]-minprice);
		}
		
		return maxprice;
	}
}