import java.util.*;
public class Balanced_Parameter
{
    Boolean Balancing(String str)
    {
        Stack s = new Stack();
        char x;
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='{' || arr[i]=='[' || arr[i]=='(')
            {
                s.push(arr[i]);
                continue;
            }
            if(str.isEmpty())
            {
                return false;
            }
            switch(arr[i])
            {
                case '}': 
                x=arr[i-1];
                s.pop();
                if(x=='[' || x=='(')
                {
                    return false;
                }
                break;

                case ']': 
                x=arr[i-1];
                s.pop();
                if(x=='{' || x=='(')
                {
                    return false;
                }
                break;

                case ')': 
                x=arr[i-1];
                s.pop();
                if(x=='[' || x=='{')
                {
                    return false;
                }
                break;
            }
        }
        return (s.empty());
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        Balanced_Parameter b = new Balanced_Parameter();
        if(b.Balancing(str))
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }
    }
}