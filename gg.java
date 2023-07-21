import java.util.*;
public class gg {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int count=1,i,j,var=0;
        int n=s.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            var=0;
            if(count==arr[i])
            {
                count++;
            }
            else if(arr[i]!=count)
            {
                var+=arr[i];
                for(j=i+1;j<n;j++)
                {
                    var=var+arr[j];
                    if(var==count)
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}
