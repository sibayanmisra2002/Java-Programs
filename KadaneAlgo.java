import java.util.*;

public class KadaneAlgo {
    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
		int currSum=a[0];
		int maxSum=a[0];
		for(int i=0;i<n;i++){
			currSum+=a[i];
			if(currSum>maxSum)
				maxSum=currSum;
			if(currSum<0)
				currSum=0;
		}
		System.out.println(maxSum);
	}
	
}
		
			