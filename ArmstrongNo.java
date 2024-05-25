public class ArmstrongNo{
	public static void main(String args[]){
		int n=151;
		int m, c=0;
		m=n;
		while(m>0){
			m=m/10;
			c++;
		}
		int s=0;
		while(n>0){
			int d=n%10;
			s+=Math.pow(d,c);
			n=n/10;
		}
		if(s==n){
			System.out.println("Armstrong");
		}
		else{
			System.out.println("Not Armstrong");
		}
	}
}
			
			
