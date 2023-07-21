class Arithmatic
{
    public void campus(int a,int b,int c)
{ 
     System.out.println("Addition: "+(a+b+c));
}
    public void campus(int a,int b)
{
     System.out.println("Modulos: "+(a%b));
}
    public void campus(double a,double b)
{ 
     System.out.println("Multiply: "+(a*b));
}
    public void campus(double a,double b,double c)
{ 
     System.out.println("Subtraction: "+(a-b-c));
}
}
class operation
{
   public static void main(String args[])
{
    Arithmatic obj=new Arithmatic();
    obj.campus(10,2,8);
    obj.campus(10,2);
    obj.campus(10.0,2.0);
    obj.campus(10.0,2.0,3.0);
}
} 