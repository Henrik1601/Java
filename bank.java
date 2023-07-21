import java.util.Scanner
class IOBank
{
    void customer(int custid, String name,int bal)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
    System.out.println("Available balance: "+bal);
}
}
interface SavingsAcc extends IOBank
{
    void saving();
}
class sav implements SavingsAcc
{
    public void(int custid, String name, int bal)
{
     System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
    System.out.println("Available balance: "+bal);
}
}   
class GovtAcc extends IOBank
{
    void govt(int custid, String name,int bal)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
    System.out.println("Available balance: "+bal);
}
}
interface CurrentAcc extends IOBank
{
    void current();
}
class curr implements CurrentAcc
{
    void current(int custid, String name, int bal)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
    System.out.println("Available balance: "+bal);
}
}
class Customer implements SavingsAcc,CurrentAcc
{
void customer(int custid, String name, int bal)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
    System.out.println("Available balance: "+bal);
}
}
class Loan extends Customer
{
    void loan(int custid, String name, int bal,int loanid)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Loan_id: "+loanid);
    System.out.println("Name: "+name);
    System.out.println("Available balance: "+bal);
}
}
class Insurance extends Customer
{
    void loan(int custid, String name)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
}
}
class FundAcc extends Customer
{
    void loan(int custid, String name)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
}
}
class SalaryAcc extends Customer
{
    void loan(int custid, String name)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
}
}
class Account
{
public static void main(String args[])
{
    int a[100];
    String[100] str;
    Scanner A=new Scanner(System.in);
    Syatem.out.println("Enter the details of Customer:");
    for(int i=0;i<5;i++)
{
    a[i]=a.nextInt();
    str[i]=a.nextLine();
}
   Customer C =new Customer(a,str);
   for(int i=0;i<5;i++)
{
    C.customer(a[i],str[i]);
}
}
}
