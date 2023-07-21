import java.util.*;
public class diagonal_addition {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=s.nextInt();
        int [][]arr=new int[size][size];
        int [][]arr2=new int[size][size];
        int i,j;
        System.out.println("Enter the first matrix: \n");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the second matrix: \n");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                arr2[i][j]=s.nextInt();
            }
        }
        System.out.println("The Resultant Matrix:\n");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                if(i==j)
                {
                    System.out.printf("%d ",arr[i][j]+arr2[i][j]);
                }
                else if(i+j==size-1)
                {
                    System.out.printf("%d ",arr[i][j]+arr2[i][j]);
                }
                else
                {
                    System.out.printf("%d ",arr[i][j]);
                }
            }
            System.out.printf("\n");
        }
    }
}
