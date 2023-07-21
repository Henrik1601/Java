import java.util.*;
public class patt {
    public static void main(String args[])
    {
        int n,i,j;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n*2-1;i++)
        {
            for(j=1;j<=n+2;j++)
            {
                if(j==1||j==2||j==n+1||j==n+2)
                {
                    System.out.print("#");
                }
                else if(i==n&&j!=1&&j!=2&&j!=n+1&&j!=n+2)
                {
                    System.out.print("$");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.printf("\n");
        }
    }

}
