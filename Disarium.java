import java.util.*;
public class Disarium {
    double result;
    Disarium(double value)
    {
        result=value;
    }
    void display()
    {
        System.out.println("Hence it is Disarium number");
    }
    public static void main(String args[])
    {
    Scanner s = new Scanner(System.in);
    int num=s.nextInt();
    int temp=num;
    double value=0,count=0;
    while(temp!=0)
    {
        int a=temp%10;
        count++;
        temp=temp/10;
    }
    temp=num;
    while(temp!=0)
    {
          int a=temp%10;
          value=value+Math.pow(a,count);
          count--;
          temp=temp/10;
    }
    if(value==num)
    {
        Disarium obj = new Disarium(value);
        obj.display();
    }
    else
    {
        System.out.println("It's not a Disarium Number");
    }
    }
}
