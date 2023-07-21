import java.util.*;
public class consecutive {
    public static void main(String args[])
    {
           Scanner s=new Scanner(System.in);
           int n=s.nextInt();
           int count=1;
           int initial=0;
           while(n!=0)
           {
               int temp=n%10;
               if(initial==temp)
               {
                count++;
                initial=temp;
                if(count==6)
                {
                    System.out.println("Sorry");
                    break;
                }
               }
               else
               {
                count=1;
                initial=temp;

               }
               n=n/10;
           }
           if(count<6)
           {
            System.out.println("Good luck");
           }
    }
}
