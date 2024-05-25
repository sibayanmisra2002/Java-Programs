class overload
{
 void f1(int a)
 {
 System.out.println("from f1(int a)");
 }
 void f1(int a,int b)
 {
 System.out.println("from f1(int a,int b)");
 }
 void f1(float a)
 {
 System.out.println("from f1(float a)");
 }
 public static void main(String args[])
 {
 overload ob = new overload();
 ob.f1(10);
 ob.f1(10,20);
 ob.f1(10.0f);
 }
}