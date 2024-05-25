import java.util.*;
public class ConsecutiveArrSum{
	public static void main(String args[]){
		int arr[]={6, -2, 3, -1};
		HashSet <Integer> runsum=new HashSet<>();
		int currsum=0;
		boolean found=false;
		
		for(int n:arr){
			currsum+=n;
			if(currsum==0 || runsum.contains(currsum)){
				found=true;
			    break;
			}
			else
				runsum.add(currsum);
		}
		if(found){
			System.out.println("1");
		}
		else
			System.out.println("0");
		}
	}
	
			
			
		
		
