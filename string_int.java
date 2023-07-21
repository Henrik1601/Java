import java.util.*;
public class string_int {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        char[]arr=str.toCharArray();
        int size=arr.length,i,sum=0;
        for(i=0;i<size;i++)
        {
            if(arr[i]>='0' && arr[i]<='9')
            {
                 sum=sum+(arr[i]-'0');
            }
        }
        System.out.println(sum);
    }
}
