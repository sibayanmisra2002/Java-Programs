import java.util.Scanner;

public class hcf {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int h=0;
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
	for(int i=1;i<=a;i++){
		if(a%i==0 && b%i==0){
			h=i;
		}
	}
	System.out.println("HCF is: "+h);
  }
}
			