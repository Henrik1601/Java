import java.util.Scanner;
class datatype
{
    public static void main(String args[])
    {
    Scanner s =new Scanner(System.in);
    System.out.println("Enter the values in String,byte,short,int,long,float,double,boolean");
    String h=s.nextLine();
    byte a=s.nextByte();
    short b=s.nextShort();
    int c=s.nextInt();
    long d=s.nextLong();
    float e=s.nextFloat();
    double f=s.nextDouble();
    boolean g=s.nextBoolean();
    System.out.println("\nByte: "+a+"\nShort: "+b+"\nInteger: "+c+"\nlong: "+d+"\nFloat: "+e+"\nDouble "+f+"\nBoolean: "+g+"\nString: "+h);
    }
}