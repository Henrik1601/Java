import java.util.*;
class test4
{
    public static void main(String args[])
    {
        int num,temp=0,count;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        while(num!=0)
        {
            if(num>=5)
            {
                count=0;
                count+=num/5;
                num=num%5;
                System.out.printf("5 Ruppees coin has frequency of %d\n",count);
                temp+=count;
            }
            else if(num>=2)
            {
                count=0;
                count=num/2;
                num=num%2;
                System.out.printf("2 Ruppees coin has frequency of %d\n",count);
                temp+=count;
            }
            else
            {
                count=0;
                count=num/1;
                num=num%1;
                System.out.printf("1 Ruppees coin has frequency of %d\n",count);
                temp+=count;
            }
        }
        System.out.printf("Minimum number of coin %d",temp);
    }
}