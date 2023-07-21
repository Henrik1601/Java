import java.util.*;
public class Remove_duplication_in {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        char []arr=str.toCharArray();
        int size=arr.length; int i,j;
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]='0';
                }
            }
        }
        for(i=0;i<size;i++)
        {
            if(arr[i]!='0')
            {
               System.out.printf("%c",arr[i]);
            }
        }
    }
}
