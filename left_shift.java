import java.util.*;
public class left_shift {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        int swift=s.nextInt();
        int count=0,index=0,in=0;
        int []temp=new int[swift];
        for(int i=0;i<swift;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=swift;i<size;i++)
        {
                arr[in]=arr[i];
                in++;
                count++;
        }
        for(int i=count;i<size;i++)
        {
            arr[i]=temp[index];
            index++;
        }
        for(int i=0;i<size;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}
