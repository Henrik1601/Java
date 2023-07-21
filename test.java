import java.util.*;
class test
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num =s.nextInt();
        int i,j;
        for(i=1;i<=num;i++)
        {
             if(num%i==0)
             {
                System.out.printf("%d ",i);
             }
        }
    }
}