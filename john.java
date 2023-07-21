import java.util.Scanner;
class john
{
public static void main(String args[])
{
int initial_velo,acceleration,time;
System.out.println("Enter the values:");
Scanner s1=new Scanner(System.in);
System.out.println("Enter the Initial Velocity:");
initial_velo=s1.nextInt();
System.out.println("Enter the Acceleration:");
acceleration=s1.nextInt();
System.out.println("Enter the Time:");
time=s1.nextInt();
int distance=((initial_velo*time)+(acceleration*time*time))/2;
System.out.println("Distance: "+distance);
}
}