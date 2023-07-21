import java.util.*;
public class copy_array {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int []arr= new int[size];
        int []copy=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
            copy[i]=arr[i];
        }
        for(int i:copy)
        {
            System.out.printf("%d ",i);
        }
    }
}
