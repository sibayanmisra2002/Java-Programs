import java.util.Scanner;
public class CapitalizeTheFirstAndLastLetterOfString {
   public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
     System.out.print("Enter String : "); 
     String s = in.nextLine();
	 String res="";
	 
	 String str[]=s.split("\\s");
	 
	 for(String st:str){
		 String first=st.substring(0,1);
		 String mid=st.substring(1, st.length()-1);
		 String last=Character.toString(st.charAt(st.length()-1));
		 res+=first.toUpperCase()+mid+last.toUpperCase()+" ";
	 }
	 System.out.println(res);
   }
}
	 
	 
	 