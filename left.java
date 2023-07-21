import java.util.*;
public class left {
    public static void main(String args[])
    {
        int []arr={1,2,3,4,5};
        int size=arr.length; int temp=0;
        Scanner s = new Scanner(System.in);
        int swift=s.nextInt();
        while(swift!=0)
    {
        for(int i=0;i<size;i++)
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
        swift--;
    }
        System.out.println(Arrays.toString(arr));
    }
}
