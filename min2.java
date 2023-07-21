import java.util.*;
public class min2 {
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int i,j;
        int [][]arr=new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                 arr[i][j]=s.nextInt();
            }
        }
        int minimum=arr[0][0];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(minimum>arr[i][j])
                {
                    minimum=arr[i][j];
                }
            }
        }
        System.out.println("Minimum value in 2D array = "+minimum);
    }
}
