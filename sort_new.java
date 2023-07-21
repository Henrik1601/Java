import java.util.*;
public class sort_new {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int []arr=new int[size];
        int i,j,count=0;
        for(i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<size;i++)
        {
            if(arr[i]<0)
            {
               count++;
            }
        }
        for(i=0;i<count;i++)
        {
            for(j=i+1;j<count;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<size;i++)
        {
            if(i==size-1)
            {
                System.out.printf("%d",arr[i]);
            }
            else
            {
                System.out.printf("%d,",arr[i]);
            }
        }
    }
}
