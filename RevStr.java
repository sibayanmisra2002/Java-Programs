public class RevStr{
	public static void main(String args[]){
		String s="hello";
		char ch[]=s.toCharArray();
		int l=0,r=s.length()-1;
		while(l<r){
			char c=ch[l];
			ch[l]=ch[r];
			ch[r]=c;
			l++; r--;
		}
		System.out.println(ch);
	}
}
			