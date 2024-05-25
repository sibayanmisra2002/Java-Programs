public class Perfect{
	public static void main(String args[]){
		int n=6;
		int s=0;
		for(int i=1;i*i<=n;i++){
			if(n%i==0){
				if(i*i==n || i==1)
				s+=i;
			else
				s+=i+(n/i);
			}
		}
		if(s==n){
			System.out.println("Perfect number");
		}
			else{
				System.out.println("not Perfect number");
			}
	}
}
				
