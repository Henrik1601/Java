class student
{
int reg;
String name;
student(int r,String n)
{
reg=r; name=n;
}
void display()
{
System.out.println("Reg_no: "+reg+" name:"+name);
}
public static void main(String args[])
{
student s1=new student(10012,"Shoto");
s1.display();
}
}
