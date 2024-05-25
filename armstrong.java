import java.util.Scanner;

public class armstrong {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
	int m=n;
	int cubes=0;
	while(n>0)
	{
		int d=n%10;
		cubes+= Math.pow(d,3);
		n=n/10;
	}
	if(m==cubes)
		System.out.print("Armstrong");
	else
			System.out.print("Not Armstrong");
  }
}