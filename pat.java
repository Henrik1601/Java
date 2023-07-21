import java.util.*;
public class pat {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n*2+2;j++)
            {
                if(i==j)
                {
                    System.out.printf("%d ",j);
                }
                else if(i+j==n*2)
                {
                    System.out.printf("%d ",j);
                }
                else if(j-i==n*2-2)
                {
                    System.out.printf("%d ",j);
                }
                else 
                {
                    System.out.printf(" ");
                }

            }
            System.out.printf("\n");
        }
    }
}
