import java.util.*;
public class LCMofNum {
    public static void main(String args[]) {
     Scanner in =new Scanner(System.in);
	 int a=in.nextInt();
	 int b=in.nextInt();
	 
	 int res=findLCM(a,b);
	 System.out.println(res);
	}
	public static int GCD(int a, int b){
		while(a!=0 && b!=0){
			if(a>b)
				a=a%b;
			else
				b=b%a;
		}
		if(a!=0)
			return a;
		else
			return b;
	}
	public static int findLCM(int a, int b){
		return (a*b)/GCD(a,b);
	}
}

	
		