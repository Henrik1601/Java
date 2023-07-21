import java.util.Scanner;
class reversion
{
public static void main(String args[])
{
int num1,num2,rev1=0,sum=0;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number1: ");
num1=s1.nextInt();
while(num1!=0)
{
int a=num1%10;
rev1=rev1*10+a;
num1=num1/10;
}
System.out.println(rev1);
System.out.println("Enter the number2: ");
Scanner s2=new Scanner(System.in);
num2=s2.nextInt();
while(num2!=0)
{
int a=num2%10;
sum=sum+a;
num2=num2/10;
}
System.out.println(sum);
int tot=rev1*sum;
System.out.println(tot);
}
}