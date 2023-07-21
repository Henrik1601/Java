import java.util.*;
public class Anagram {
    
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        String original=s.nextLine();
        String compare=s.nextLine();
        char []origin=original.toCharArray();
        char []comp=compare.toCharArray();
        int i ,index;
        for(i=0;i<origin.length;i++)
        {
            index=0;
            while(index<comp.length)
            {
               if(origin[i]==comp[index])
               {
                   origin[i]='0';
                   index=comp.length;
               }
               index++;
            }
        }
        int count=0;
        for(i=0;i<origin.length;i++)
        {
            if(origin[i]!='0')
            {
                continue;
            }
            else
            {
                count++;
            }
        }
        if(count<origin.length)
        {
            System.out.println("It is not Anagram");
        }
        else
        {
            System.out.println("It is Anagram");
        }
    }
}
