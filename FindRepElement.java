import java.util.*;
public class FindRepElement{
	public static void repeat(int a[]){
		HashMap <Integer, Integer> map=new HashMap<>();
		for(int i:a){
			if(map.get(i)==null){
				map.put(i,1);
			}
			else {
				map.put(i,map.get(i)+1);
			}
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			if(entry.getValue()>1){ //if(entry.getValue()==1)-->for non repeating elements
				System.out.print(entry.getKey()+" ");
			}
		}
	}
	
	public static void main(String args[]){
		int a[]={2,2,3,3,5,6,7,7,8};
		repeat(a);
		
	}
}
