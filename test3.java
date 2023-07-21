import java.util.*;
class test3
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int n1=1,n2=1;
        int sum=0;
        for(int i=3;i<=num;i++)
        {
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        System.out.println(sum);
    }
}