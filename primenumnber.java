public class primenumnber{
	public static void main(String args[]){
		int n=12;
		
		if(isPrime(n)){
			System.out.println("Prime");
		}
		else 
			System.out.println("Not Prime");
		
	}
	
		public static boolean isPrime(int n){
			
	if(n==0 || n==1){
		return false;
	}
	if(n==2 || n==3)
		return true;
	if(n%2==0 || n%3==0)
		return false;
	for(int i=5;i*i<=2;i+=6){
		if(n%i==0|| n%(i+2)==0){
			return false;
		}
	}
	return true;
		}
}

		
	
		
		
