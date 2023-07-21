import java.util.Scanner;
class bitwise
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value1: ");
int a=s.nextInt();
System.out.println("Enter the value2: ");
int b=s.nextInt();
System.out.println("Bitwise AND: "+(a&b));
System.out.println("Bitwise OR: "+(a|b));
System.out.println("Bitwise NOT (a) and (b): "+(~a) +(~b));
System.out.println("Bitwise XOR: "+(a^b));
}
}