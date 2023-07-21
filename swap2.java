class swap2
{
public void swapping()
{
int a=5,b=10,temp;
temp=a;
a=b;
b=temp;
System.out.println("a= "+a);
System.out.println( "b= "+b);
}
public static void main(String args[])
{
swap2 s=new swap2();
s.swapping();
}
}