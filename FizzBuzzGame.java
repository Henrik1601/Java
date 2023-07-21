import java.util.*;
public class FizzBuzzGame {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        if(num%3==0 && num%5==0)
        {
            System.out.println("FizzBuzz");
        }
        else if(num%3==0)
        {
            System.out.println("Fizz");
        }
        else if(num%5==0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.printf("%d",num);
        }
    }
}
