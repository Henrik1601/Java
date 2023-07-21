import java.util.*;
public class String_check {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        if(str.isEmpty()==true)
        {
            System.out.println("The String is empty");
        }
        else
        {
            System.out.println("The String is not empty");
        }
    }
}
