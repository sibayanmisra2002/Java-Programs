public class MergeSortedArr{
	public static void main(String args[]){
		int a1[]={1,2,3,4,5};
		int a2[]={6,7,8,9,10,11,12,13};
		int i=0, j=0, k=0;
		int m[]=new int[a1.length+a2.length];
		
		while(i<a1.length && j<a2.length){
			if(a1[i] < a2[j]){
				m[k]=a1[i];
				i++;
				k++;
			}
			else{
				m[k]=a2[j];
				j++;
				k++;
			}
		}
		while(i<a1.length){
			m[k]=a1[i];
			i++;
			k++;
		}
		while(j<a2.length){
			m[k]=a2[j];
			j++;
			k++;
		}
		System.out.println("Merged Sorted Array: ");
		for(int h:m){
			System.out.print(h+" ");
		}
	}
}
			
				
		
