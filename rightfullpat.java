import java.util.*;
public class rightfullpat {
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int temp=num;
        int size=num*2-1;
        int i,j,val=1;
        for(i=1;i<=size;i++)
        {
            if(i>=num)
            {
                for(int k=1;k<=val;k++)
                {
                    System.out.printf("%d ",k);
                }
                val++;
            }
            else
            {
                for(j=1;j<=temp;j++)
                {
                   System.out.printf("%d ",j);
                }
                temp--;
            }
            System.out.printf("\n");
        }
    }
}
