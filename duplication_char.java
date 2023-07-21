import java.util.*;
public class duplication_char {
    
    public static void main(String args[])
    {
         Scanner s = new Scanner(System.in);
         String str=s.nextLine();
         char []arr=str.toCharArray();
         int size=arr.length; int i,j,count,index=0;
         char []dup=new char[size];
         for(i=0;i<size;i++)
         {
            count=0;
            for(j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]='0';
                }
            }
            if(count>0)
            {
                dup[index]=arr[i];
                index++;
            }
         }
         for(i=0;i<dup.length;i++)
         {
            if(dup[i]!='0')
            {
               System.out.printf("%c",dup[i]);
            }
         }

    }
}
