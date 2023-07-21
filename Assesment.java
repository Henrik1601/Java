import java.util.*;
public class Assesment {
   
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size=7;
        int []arr=new int[size];
        int pivot=3;
        int i,j,temp=0;
        for(i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        while(pivot!=0)
        {
            for(i=0;i<size;i++)
            {
                  if(i==0)
                  {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                  }
                  else if(i==size-1)
                  {
                    arr[i]=temp;
                  }
                  else
                  {
                    arr[i]=arr[i+1];
                  }
            }
            pivot--;
        }
        int target=s.nextInt();
        int count=0;
        for(i=0;i<size;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
        for(i=0;i<size;i++)
        {
            if(arr[i]==target)
            {
                System.out.printf("\n%d",i);
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.printf("\n-1");
        }
    }
}
