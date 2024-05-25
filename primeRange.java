import java.util.*;
public class primeRange{
	public static boolean prime(int n){
		if(n<=1)
			return false;
		
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0){
			return false;}
		}
		return true;
		
	}
				
 public static void main(String[] args) {
	 Scanner in =new Scanner(System.in);
        int l=in.nextInt();
		int u=in.nextInt();
		for(int i=l;i<=u;i++){
			if(prime(i)){
				System.out.println(i+" ");
			}
		}
    }
	
}