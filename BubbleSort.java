import java.util.Arrays;
public class BubbleSort{
	public static void bubble(int a[]){
		for(int i=0;i<a.length;i++)
		{int flag=0;
			for(int j=0;j<a.length-i-1;j++){
		
				if(a[j]> a[j+1]){
					
					int c= a[j];
				a[j]=a[j+1];
				a[j+1]=c;
				flag=1;
				}
			}
			if(flag==0)
				break;
	}
	}
	public static void main(String args[]){
		int a[]={8,2,1,5,7,9};
		System.out.println("Original Array: "+ Arrays.toString(a));
		bubble(a);
			System.out.println(Arrays.toString(a));
		
	}
}
