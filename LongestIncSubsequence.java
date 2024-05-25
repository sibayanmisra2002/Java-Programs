import java.util.*;
public class LongestIncSubsequence {
    public static void main(String args[]) {
     Scanner in =new Scanner(System.in);
	 String ele[]=in.nextLine().split(" ");
	 int arr[]=new int[ele.length];
	 for(int i=0;i<ele.length;i++){
		 arr[i]=Integer.parseInt(ele[i]);
	 }
	 
	 int maxLength=1;
	 int length=1;
	 
	 for(int i=1;i<ele.length;i++){
		 if(arr[i]>arr[i-1]){
			 length++;
		 }
		 else
		 {
			 maxLength=Math.max(maxLength,length);
			 length=1;
		 }
		 
	 }
	 int result=Math.max(maxLength,length);
	 System.out.println("Length of the Longest Increasing Subsequence: " + result);
	}
}