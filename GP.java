public class GP{
	public static void main(String args[]){
		float a=2;
		float r=2;
		float n=4;
		float s= a*((float)Math.pow(r,n)-1)/(r-1);
		System.out.println("Sum of GP series is : " + s);
	}
}