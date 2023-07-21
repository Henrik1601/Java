import java.util.*;
class negative{
    void verify(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                count++;
            }
        }
        System.out.printf("%d\n",count);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                System.out.printf("%d ",arr[i]);
            }
        }
    }
}
public class negative_value {
  
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        negative obj = new negative();
        obj.verify(arr);
    }
}
