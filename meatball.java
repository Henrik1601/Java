import java.util.*;
class evaluate{
    void verify(int []arr,int cuts)
    {
        int count=0,temp=0;
        while(arr[0]>=cuts)
        {
            arr[0]=arr[0]-cuts;
            for(int i=0;i<arr.length;i++)
            {
                if(i==0)
                {
                    temp=arr[i];
                }
                else if(i!=arr.length-1)
                {
                    arr[i]=arr[i+1];
                }
                else
                {
                    arr[i]=temp;
                }
            }
            count++;
        }
        System.out.printf("%d ",count);
    }
}
public class meatball {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int cuts=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        evaluate e = new evaluate();
        e.verify(arr,cuts);
    }
}
