interface swap4
{
 public void swapping();
}
class swapp implements swap4
{
public void swapping()
{
int a=5,b=10,temp;
temp=a;
a=b;
b=temp;
System.out.println("a= "+a +"b= "+b);
}
}
class main
{
public static void main(String args[])
{
swapp s=new swapp();
s.swapping();
}
}
