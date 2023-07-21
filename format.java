import java.util.Scanner;
class format
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int num1=s.nextInt();
        System.out.println(String.format("%05d",num)+""+String.format("%05d",num1));
    }
}