import java.util.*;
public class AscDesArray {
    public static void main(String args[]) {
     Scanner in =new Scanner(System.in);
	 int n=in.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++){
		 a[i]=in.nextInt();
	 }
	 
	 Arrays.sort(a);
	 for(int i=0;i<n/2;i++){
		 System.out.print(a[i]+" ");
	 }
	 for(int j=n-1;j>=n/2;j--){
		 System.out.print(a[j]+" ");
	 }
	 
	}
}
	 
	 
	 