public class CheckRotString{
	public static void main(String args[]){
		String a="1011";
		String b="0110";
		String con=a+a;
		if(a.length()!=b.length()){
			System.out.println("-1");
		}
		if(con.contains(b))
		{
			System.out.println("1");
		}
		else 
			System.out.println("-1");
	}
}
		
			
