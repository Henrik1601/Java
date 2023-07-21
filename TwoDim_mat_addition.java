import java.util.*;
public class TwoDim_mat_addition {
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,size1,size2,size3,size4;
        System.out.println("Enter the row size and column size of matrix 1");
        size1=s.nextInt();size2=s.nextInt();
        int [][]arr1=new int[size1][size2];
        System.out.println("Enter the elements of matrix 1");
        for(i=0;i<size1;i++)
        {
            for(j=0;j<size2;j++)
            {
                arr1[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the row size and column size of matrix 2");
        size3=s.nextInt();size4=s.nextInt();
        int [][]arr2=new int[size3][size4];
        System.out.println("Enter the elements of matrix 2");
        for(i=0;i<size3;i++)
        {
            for(j=0;j<size4;j++)
            {
                arr2[i][j]=s.nextInt();
            }
        }
        System.out.println("Resultant Matrix");
        for(i=0;i<size1;i++)
        {
            for(j=0;j<size4;j++)
            {
                System.out.printf("%d ",arr1[i][j]+arr2[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
