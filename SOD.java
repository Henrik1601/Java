import java.util.*;
class SOD 
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number:");
      int num = s.nextInt(); int rev=0;
      while(num!=0)
      {
        int a=num%10;
        rev+=a;
        num=num/10;
      }
      System.out.println("The Sum of the digits of given number is: "+rev);
   }    
}
