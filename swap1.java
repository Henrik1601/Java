class swap1
{
public void swapping()
{
   int a=5,b=10,c=15;
   int temp=a; a=b; b=c; c=temp;
   System.out.println("a=" +a);
   System.out.println("b=" +b);
   System.out.println("c=" +c);
}
public static void main(String args[])
{
   swap1 s =new swap1();
   s.swapping();
}
}