import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		
		Map <Integer, Integer> map=new HashMap<>();
		
		for(int arr:a){
			map.put(arr, map.getOrDefault(arr,0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}