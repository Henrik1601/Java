import java.util.Scanner;
class cube
{
public static void main(String args[])
{
int num, value;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
num=s.nextInt();
value=num*num*num;
System.out.println(value);
}
}
