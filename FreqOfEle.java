import java.util.*;
public class FreqOfEle {
    public static void main(String args[]) {
     Scanner in =new Scanner(System.in);
	 int n=in.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++){
		 a[i]=in.nextInt();
	 }
	 
	 Map<Integer, Integer> map=new HashMap<>();
	 for(int i=0;i<n;i++){
		 if(map.containsKey(a[i])){
			 map.put(a[i],map.get(a[i])+1);
		 }
		 else
			 map.put(a[i],1);
	 }
	 
	 List<Map.Entry<Integer, Integer>> entryList=new ArrayList<>(map.entrySet());
	 entryList.sort(Map.Entry.comparingByValue());
	 
	 for(Map.Entry<Integer, Integer> entry: entryList){
		 int freq=entry.getValue();
		 for(int i=0;i<freq;i++)
		 System.out.println(entry.getKey()+" ");
	 }
	}
}
	 
	 