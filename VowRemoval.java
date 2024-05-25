public class VowRemoval{
	public static void main(String args[]){
		String s="mom";
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
				res.append(c);
			}
			
		}
		System.out.println(res.toString());
	}
}