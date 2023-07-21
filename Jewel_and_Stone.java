import java.util.*;
public class Jewel_and_Stone {
    
    public static void main(String args[])
    {
         Scanner s = new Scanner(System.in);
         String or=s.nextLine();
         String str=s.nextLine();
         int i,j,count=0;
         for(i=0;i<or.length();i++)
         {
             for(j=0;j<str.length();j++)
             {
                if(or.charAt(i)==str.charAt(j))
                {
                     count++;
                }
             }
         }
         System.out.println(count);
    }
}
