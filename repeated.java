import java.util.*;
public class repeated {
   public static void main(String args[]){
    int n=10;
    Scanner s= new Scanner(System.in);
    int a[]=new int[n];
    int res[]=new int[10];
    int index=0;
    for(int i=0;i<n;i++)
    {
       a[i]=s.nextInt();
    }
    Arrays.sort(a);
    for(int i=0;i<n;i++)
    {
        int temp=0;
        if(a[i]!=-1)
        {
            for(int j=i+1;j<n;j++)
            {
               if(a[i]==a[j])
               {
                 if(temp!=a[i])
                 {
                    temp=a[i];
                 }
                 a[j]=-1;
               }
            }
        }
        if(temp>0)
        {
            res[index++]=temp;
        }
    }
    int count=0;
    for(int i=0;i<index;i++)
    {
        System.out.printf("%d ",res[i]);
        count++;
    }
    System.out.printf("\n%d",count);
   } 
}
