import java.util.*;

public class RotateArr {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		System.out.println("k: ");
		int k=in.nextInt();
		
		RotateArr ob=new RotateArr();
		
		//ob.leftRot(a,k);
		ob.rightRot(a,k);
		ob.rotbyk(a,k);
		
		System.out.print("Rotated Array: ");
		for(int num:a){
			System.out.print(num+" ");
		}
	
	}
	
	public static void leftRot(int a[],int k){
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
		reverse(a,0,a.length-1);
	}
	public static void rightRot(int a[],int k){
		reverse(a,0,a.length-1);
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
	}
	public static void rotbyk(int a[],int k){
		k=k%a.length;
		reverse(a,0,a.length-1);
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
	}
	public static void reverse(int a[],int l,int r){
		while(l<r){
			int t=a[l];
			a[l]=a[r];
			a[r]=t;
			l++;r--;
		}
	}
}