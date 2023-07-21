import java.util.*;
class type_convert
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        double num = s.nextDouble();
        int integer=(int)num;
        System.out.println("Converting of double value "+num+" to integer is "+integer);
    }
}