import java.util.*;
public class PrimeSumPair{
	public static boolean isPrime(int n){
		if(n<=1)
			return false;
		for(int i=3;i*i<=n;i+=2){
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String args[]){
		 Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean found = false;

        for(int i=3;i*i<=number;i+=2) {
            if (isPrime(i) && isPrime(number - i)) {
                System.out.println("The given number " + number + " can be expressed as the sum of two prime numbers " + i + " and " + (number - i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The given number " + number + " cannot be expressed as the sum of two prime numbers.");
        }
	}
}	
