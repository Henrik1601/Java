import java.util.*;
public class pat10 {
    
    public static void main(String args[])
    {
         Scanner s= new Scanner(System.in) ;
         int num=s.nextInt();
         int i,j;
         for(i=0;i<num;i++)
         {
            for(j=0;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.printf("1 ");
                }
                else
                {
                    System.out.printf("0 ");
                }
            }
            System.out.printf("\n");
         }
    }
}
