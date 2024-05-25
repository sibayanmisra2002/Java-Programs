import java.util.*;

public class ProSmall {	
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("sum:");
		int sum=in.nextInt();
		System.out.print("size of Arr:");
		int size=in.nextInt();
		System.out.print("arr:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
		
		int p=1, sum1=0;;
		Arrays.sort(arr);
		sum1=arr[0]+arr[1];
		
		if(sum1<sum)
	    p=arr[0]*arr[1];
	System.out.print(p);
	}
	}
	
	
	