import java.util.*;
public class chocolate {
    
    public static void main(String args[])
    {
        Scanner s =  new Scanner(System.in);
        int len=s.nextInt();
        int cut=s.nextInt();
        int []arr=new int[cut];
        int i,j,count=0,min=1000;
        for(i=0;i<cut;i++)
        {
            arr[i]=s.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
            count=0;
                for(j=1;j<=len;j++)
                {
                    if(j!=arr[i])
                    {
                        count=count+j;
                    }
                }
            if(min>count)
            {
                min=count;
            }
        }
        System.out.printf("%d",min);
    }
}
