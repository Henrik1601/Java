abstract class swap3
{
   abstract void swapping()
{
     int a=5,b=10,temp;
     temp=a;
     a=b;
     b=temp;
     System.out.println("a= "+a + "b="+b);
}
}
class call extends swap3
{
public static void main(String args[])
{
swap3 s=new call();
s.swapping();
}
}