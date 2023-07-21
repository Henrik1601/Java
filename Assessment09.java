import java.util.*;
class verify{
    void method_verify(int []arr)
    {
        int i,sum=0;
        for(i=0;i<arr.length;i++)
        {
            if(i%2!=0)
            {
                sum+=arr[i];
            }
        }
        System.out.printf("%d",sum);
    }
}
public class Assessment09 {
    
    public static void main(String args[])
    {
        Scanner s =  new Scanner(System.in);
        int size=s.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        verify obj=new verify();
        obj.method_verify(arr);
    }
}
