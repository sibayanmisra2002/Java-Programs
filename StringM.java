import java.util.*;
public class StringM{
public static void main(String args[]){
	//String s= "Rain have started here and not stopping still showering";
	//System.out.println(s.indexOf('s')); //1st occurrence of s
	//System.out.println(s.indexOf('s', s.indexOf('s')+1)); //2nd occurrence of s
	//System.out.println(s.indexOf('s',s.indexOf('s', s.indexOf('s') + 1) + 1)); //3rd occurrence of s
	
	String a="Hello";
	String b="World";
	//int a=100;
	//int b=200;
	//double d=12.5;
	//long l= 1234567890;
	//System.out.println(d+a+b+x);
	
	
	//SWAP
	a=a+b;
	b= a.substring(0, a.length()-b.length());
	a= a.substring(b.length());
	System.out.println("a="+a);
	System.out.println("b="+b);
	
	
  

}
}