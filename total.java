class total
{
public static void main(String args[])
{
int num=561; 
int a,sum=0;
while(num!=0)
{
     a=num%10;
     sum=sum+a;
     num=num/10;
}
System.out.println("Values: "+sum);
}
}