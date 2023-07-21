import java.util.*;
public class third {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int temp=0,count,ans=0;
        while(num!=0)
        {
            ans=0;
            count=1;
            int a=num%10;
            if(temp==a)
            {
                count++;
                temp=a;
            }
            else
            {
                temp=a;
                count=1;
            }
            if(count==temp)
            {
                ans=1;
                break;
            }
            num=num/10;
        }
        if(ans==1)
        {
            System.out.println("Sorry");
        }
        else if(ans==0)
        {
            System.out.println("Good luck");
        }
    }
}
