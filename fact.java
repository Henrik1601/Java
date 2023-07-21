import java.util.*;
class fact
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt(); int i,fact=1;
        for(i=num;i>0;i--)
        {
             fact*=i;
        }
        System.out.println("The Factorial of the given number is: "+fact);
    }
}