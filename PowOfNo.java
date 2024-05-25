public class PowOfNo{
	public static void main(String args[]){
		int n=11,k=2, p=1;;
		for(int i=1;i<=k;i++){
			p=p*n;
		}
		System.out.println(n+" to the power "+k+" = "+p);
	}
}