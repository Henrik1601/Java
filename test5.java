import java.util.*;
class test5
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int freq=1;
        while(num!=0)
        {
            int a = num%10;
            freq= freq*a;
            num=num/10;
        }
        System.out.println(freq);
    }
}
