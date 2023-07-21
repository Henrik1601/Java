import java.util.*;
public class Remove_char {
     public static void main(String args[])
     {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String post=sb.toString();
        if(post.equals(str))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
     }
}
