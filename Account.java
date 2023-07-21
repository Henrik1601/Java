import java.util.Scanner;
interface IOBank
{
    public void customer(int custid, String name,int bal)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
    System.out.println("Available balance: "+bal);
}
}
public interface SavingsAcc implements IOBank
{
    public void saving(int custid, String name, int bal);
}
public class sav implements SavingsAcc
{
    public void s(int custid, String name, int bal)
{
     System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
    System.out.println("Available balance: "+bal);
}
}   
public class GovtAcc extends IOBank
{
    public void govt(int custid, String name,int bal)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
    System.out.println("Available balance: "+bal);
}
}
public interface CurrentAcc implements IOBank
{
    public void current();
}
public class curr implements CurrentAcc
{
    public void current(int custid, String name, int bal)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
    System.out.println("Available balance: "+bal);
}
}
public class Customer implements SavingAcc,CurrentAcc
{
public void customer(int custid, String name)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
}
}
public class Loan extends Customer
{
    public void loan(int custid, String name, int bal,int loanid)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Loan_id: "+loanid);
    System.out.println("Name: "+name);
    System.out.println("Available balance: "+bal);
}
}
public class Insurance extends Customer
{
    public void loan(int custid, String name)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
}
}
public class FundAcc extends Customer
{
    public void loan(int custid, String name)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
}
}
public class SalaryAcc extends Customer
{
    public void loan(int custid, String name)
{
    System.out.println("Customer_id: "+custid);
    System.out.println("Name: "+name);
}
}
class Account
{
public static void main(String args[])
{
    int a[];
    String[] str;
    Scanner A=new Scanner(System.in);
    System.out.println("Enter the details of Customer:");
    for(int i=0;i<5;i++)
{
    a[i]=A.nextInt();
    str[i]=A.nextLine();
}
   Customer C =new Customer();
   for(int i=0;i<5;i++)
{
    C.customer(a[i],str[i]);
}
}
}
