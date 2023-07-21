import java.util.*;
public class R_pattern {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int row=s.nextInt();
        int mid=row/2;
        for(int i=1;i<=row;i++)
        {
            if(i<=mid)
            {
                for(int j=1;j<=row-2;j++)
                {
                    if(i==1||i==mid||j==1||j==row-2)
                    {
                        System.out.printf("* ");
                    }
                    else
                    {
                        System.out.printf("  ");
                    }
                }
            }
            else
            {
                for(int j=1;j<=row-2;j++)
                {
                   if(j==1||i-j==mid-1)
                   {
                    System.out.printf("* ");
                   }
                   else
                   {
                    System.out.printf("  ");
                   }
                }
            }
            System.out.printf("\n");
        }
    }
}
