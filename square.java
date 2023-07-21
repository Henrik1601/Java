import java.util.Scanner;
class square
{
public static void main(String args[])
{
int num1,num2,value;
Scanner s1=new Scanner(System.in);
Scanner s2=new Scanner(System.in);
num1=s1.nextInt();
num2=s2.nextInt();
value=(num1*num1)+(num2*num2);
System.out.println(value);
}
}