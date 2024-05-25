public class Kadane{
public static int kadane(int a[]){
	int currSum=0;
	int maxSum=0;
	for(int i=0;i<a.length;i++){
		currSum=currSum+a[i];
		if(currSum > maxSum){
			maxSum=currSum;
		}
		if(currSum<0){
			currSum=0;
		}
	}
	return maxSum;
}
public static void main(String args[]){
	int a[]={-1,-2,-3,-4};
	int k= kadane(a);
	System.out.println("Maximum Subarray="+k);
}
}