class program2
{
 program2(int a)
 {
 System.out.println("Constructor(int a)");
 }
 program2(int a,int b)
 {
 System.out.println("Constructor(int a,int b)");
 }
 program2(float a)
 {
 System.out.println("Constructor(float a)");
 }
 public static void main(String args[])
 {
 program2 ob1 = new program2(10);
 program2 ob2 = new program2(10,20);
 program2 ob3 = new program2(10.0f);
 }
}
