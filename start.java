class additon
{
    public void campus(int a, int b)
{ 
    System.out.println("Addition: "+(a+b));
}
}
 class modulos extends addition
{
    public void campus(int a, int b)
{ 
    System.out.println("Modulos: "+(a%b));
}
}
class multiplication extends addition
{
    public void campus(int a, int b)
{ 
    System.out.println("Multiply: "+(a*b));
}
}
class subtract extends addition
{
    public void campus(int a, int b)
{ 
    System.out.println("sub: "+(a-b));
}
}
class start
{
   public static void main(String args[])
{
   addition obj =new addition();
   obj.campus(2,3);
   }
}
