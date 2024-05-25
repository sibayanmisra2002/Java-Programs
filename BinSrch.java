public class BinSrch {
    public static int bin(int a[], int k) {
		int left=0;
		int right= a.length-1;
		while(left<right)
		{
			int mid= (left+right)/2;
			if(a[mid]==k)
				return mid;
			else if(a[mid]<k)
				left=mid+1;
			else
				right=mid-1;
	}
	return -1;
	}
	public static void main (String args[]){
		int a[]={ 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int k=10;
		int index= bin(a,k);
		if(index==-1)
			System.out.println("Not Found");
		else
			System.out.println("Index is="+index);
	}
}