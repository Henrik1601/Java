import java.util.*;
public class reverse {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int i;
        int []arr=new int[size];
        for(i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        for(i=size-1;i>=0;i--)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}
