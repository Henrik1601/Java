import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
int num,final_num;
Scanner s=new Scanner(System.in);
num=s.nextInt();
int fact=1;
for(int i=num;i>=1;i--)
{
fact=fact*i;
}
System.out.println("Factorial: "+fact);
System.out.println("Give your number: ");
Scanner s1=new Scanner(System.in);
final_num=s1.nextInt();
fact=fact+final_num;
System.out.println("Output: "+fact);
}
}
