import java.util.Scanner;
class name
{
int var1,var2;
public static void main(String args[])
{
name h1=new name();
name h2=new name();
System.out.println("Enter the values: ");
Scanner s1=new Scanner(System.in);
Scanner s2=new Scanner(System.in);
h1.var1=s1.nextInt();
h2.var2=s2.nextInt();
int sum=0;
int multiply=h1.var1*h2.var2;
System.out.println("Multiplied Value: "+multiply);
while(multiply!=0)
{
int a= multiply%10;
sum=sum+a;
multiply=multiply/10;
}
System.out.println("The sum of the digits: "+sum);
}
}

