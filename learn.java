import java.util.Scanner;
class learn
{
public static void main(String args[])
{
int a,b,c;
System.out.println("Enter the values:");
Scanner s1 = new Scanner(System.in);
Scanner s2 = new Scanner(System.in);
Scanner s3 = new Scanner(System.in);
a=s1.nextInt();
b=s2.nextInt();
c=s3.nextInt();
int choice;
System.out.println("Enter your choice:");
Scanner ch = new Scanner(System.in);
choice=ch.nextInt();
switch(choice)
{
case 1:
{
System.out.println(a*b*c);
break;
}
case 2:
{
System.out.println((a+b)-c);
break;
}
case 3:
{
System.out.println("The greatest number:");
if(a>b &&a>c)
{
    System.out.println(a);
    break;
}
else if(b>a &&b>c)
{
    System.out.println(b);
    break;
}
else
{
    System.out.println(c);
    break;
}
}
case 4:
{
System.out.println(a*b+c);
break;
}
}
}
}
