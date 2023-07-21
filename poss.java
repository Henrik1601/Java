import java.util.*;
public class poss {
    
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        int w=s.nextInt();
        int n=s.nextInt();
        int k=s.nextInt();
        int count=0;
        for(int i=k;i<=m;i++)
        {
            for(int j=w;j>k;j--)
            {
                if(i+j==n)
                {
                    count++;
                }
            }
        }
        System.out.printf("%d",count);
    }
}
