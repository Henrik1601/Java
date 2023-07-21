import java.util.Scanner;
class Box
{
int length, breath, height;
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
Scanner s2=new Scanner(System.in);
Scanner s3=new Scanner(System.in);
Box ob1= new Box();
Box ob2= new Box();
Box ob3= new Box();
ob1.length=s1.nextInt();
ob2.breath=s2.nextInt();
ob3.height=s3.nextInt();
int volume=ob1.length*ob2.breath*ob3.height;
System.out.println("Volume: "+volume);
}
}
