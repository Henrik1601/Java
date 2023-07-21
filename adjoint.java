import java.util.*;
public class adjoint {
   
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        float [][]arr=new float[2][2];
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
               arr[i][j]=s.nextFloat();
            }
        }
        int mod_left=1,mod_right=1;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                if(i==j)
                {
                    mod_left*=arr[i][j];
                }
                else if(i+j==2-1)
                {
                    mod_right*=arr[i][j];     
                }
            }
        }
        int mod=mod_left-mod_right;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                if(i==j)
                {
                    if(i+1<2 && j+1<2)
                    {
                        float temp=arr[i][j];
                        arr[i][j]=arr[i+1][j+1];
                        arr[i+1][j+1]=temp;
                    }
                }
                else if(i+j==2-1)
                {
                    arr[i][j]=-arr[i][j];
                }
            }
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                arr[i][j]=arr[i][j]/mod;
            }
        }
        System.out.println("Resultant Matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.printf("%.1f ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
