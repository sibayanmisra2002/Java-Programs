import java.util.Scanner;

public class primeNo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
	boolean isPrime=true;
	for(int i=2;i<=n/2;i++){
		if(n%i==0){
			isPrime=false;
			break;
		}
	}
	if(isPrime)
		System.out.println("Prime");
	else
		System.out.println("Not Prime");
  }
}
		
 