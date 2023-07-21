import java.util.*;
class mat
{
    public void verify(int [][]arr,int row,int col)
    {
        int minimum=arr[0][0];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(minimum<arr[i][j])
                {
                    minimum=arr[i][j];
                }
            }
        }
        System.out.println("Minimum value in 2D array = "+minimum);
    }
}
class min {
    
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
        mat obj = new mat();
        obj.verify(arr,row,col);
    }
}
