import java.util.Scanner;
class temperature
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Celsius:");
int cel=s.nextInt();
double fahr = ((cel*9)/5)+32;
System.out.println("Fahrenheit: "+fahr);
}
}
