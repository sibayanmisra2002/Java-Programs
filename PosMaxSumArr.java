public class PosMaxSumArr{
	public static void main (String args[]){
		int arr[]={1,-3,-2,-4,7,0};
		int sum=0,max=0,c=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=0){
				sum+=arr[i];
				c++;
			}
			else if(arr[i]>max){
				max=arr[i];
			}
		}
		if(sum==0){
			sum=max;
			c=1;
		}
		
	System.out.println("Sum: "+sum+" "+"Count: "+c);
	}
}

