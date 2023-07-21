import java.util.*;
import java.io.*;
class printing
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first numner: ");
        int first_num = s.nextInt();
        System.out.println("Enter the first numner: ");
        int second_num = s.nextInt();
        System.out.printf("Printing first number as a five digit number: %05d"+first_num);
    }
}