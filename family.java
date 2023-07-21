class grand
{

    public void grandf();

}
class grandfather extends grand
{
public void grandf()
{
       int age=60;
    int salary=20000;
   System.out.println("Age of Grandfather: "+age);
   System.out.println("Salary of Grandfather: "+salary);
}
public void sonf();

    public void daughterf()
{
       int age=25;
    int salary=35000;
   System.out.println("Age of Grandfather's Daughter: "+age);
   System.out.println("Salary of Grandfather's Daughter: "+salary);
}
    public void hson()
{
       int age=5;
    int fee=20000;
   System.out.println("Age of Grandson1: "+age);
   System.out.println("Salary of Grandson1: "+fee);
}
    public void hdaughter()
{
     int age=6;
    int fee=20000;  
   System.out.println("Age of Grand Daughter1: "+age);
   System.out.println("Salary of Grand Daughter1: "+fee);
}
    public void herson();
{
      int age=4;
    int fee=10000; 
   System.out.println("Age of Grandson2: "+age);
   System.out.println("Salary of Grandson2: "+fee);
}
}
 interface son extends grand
{
public void sonf()
{
       int age=30;
    int salary=30000;
   System.out.println("Age of Grandfather's son: "+age);
   System.out.println("Salary of Grandfather's son: "+salary);
}

}
 class daughter_in_law implements son 
{

    public void dil()
{
       int age=30;
    int salary=25000;
   System.out.println("Age of Daughter_in_law: "+age);
   System.out.println("Salary of Daughter in law: "+salary);
}
}
 interface daughter extends grand
{

    public void daughterf();
}
 class son_in_law implements daughter
{

    public void sil()
{
       int age=30;
    int salary=30000;
   System.out.println("Age of Grandfather's son: "+age);
   System.out.println("Salary of Grandfather's son: "+salary);
}
}
 class his_son implements son,extends grand
{

    public void hson();
}
 class his_daughter implements son,extends grand
{
    public void hdaughter();
}
 class her_son implements daughter,extends grand
{

    public void herson();
}
class family
{
public static void main(String args[])
{
grand obj = new grand();
obj.grandf();
obj.sonf();
obj.daughterf();
}
}