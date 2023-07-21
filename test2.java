class cube
{
void add(int y)
{
System.out.println("The cube value of first 3 num: "+y);
}
}
 class sub extends cube
{
 sub(int x);
{
System.out.println("The cube value of first 3 num: "+x);
}
}
class test2
{
public static void main(String args[])
{
sub s=new sub(3);
s.add(3);

}
}