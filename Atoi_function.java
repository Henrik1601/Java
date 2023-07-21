import java.util.*;
public class Atoi_function {
    
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        char []arr=str.toCharArray();
        int i,sumit=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>='0' && arr[i]<='9')
            {
                sumit=sumit*10+(arr[i]-48);
            }
            else
            {
                System.out.println("-1");
                System.exit(0);
            }
        }
        System.out.println(sumit);
    }
}
