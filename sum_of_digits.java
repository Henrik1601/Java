import java.util.Scanner;
class sum_of_digits
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value: ");
int num=s.nextInt();
int sum=0;
while(num!=0)
{
int a=num%10;
sum+=a;
num=num/10;
}
System.out.println("sum_of_digits: "+sum);
}
}