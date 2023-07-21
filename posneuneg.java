import java.util.*;
public class posneuneg {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int []arr=new int[size];
        int i;
        float pos=0,neg=0,neu=0;
        for(i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
            if(arr[i]>0)
            {
                pos++;
            }
            else if(arr[i]<0)
            {
                neg++;
            }
            else
            {
                neu++;
            }
        }
        System.out.printf("%.1f %.1f %.1f",pos/size,neu/size,neg/size);
    }
}
