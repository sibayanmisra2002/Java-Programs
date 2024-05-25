import java.util.*;
public class LongestPalinEle {
    public static void main(String args[]) {
     Scanner in =new Scanner(System.in);
	 int n=in.nextInt();
	 int a[]=new int[n];
	 int res=0;
	 for(int i=0;i<n;i++){
		 a[i]=in.nextInt();
	 }

	 for(int i=0;i<n;i++){
		 if(isPalin(a[i])==1 && a[i]>res){
			 res=a[i];
		 }
	 }
	 System.out.println(res);
	 
	}
	 
	 public static int isPalin(int n){
		 int r=0, m=n;
		 while(m>0){
			 int d=m%10;
			 r=r*10+d;
			 m/=10;
			 
	 }
	 if(n==r)
		 return 1;
	 else return 0;
	 
	}
}