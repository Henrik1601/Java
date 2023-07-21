import java.util.*;
public class ordering_matrix {
    public void evaluate_column(int [][]arr)
    {
        int i,j,k,mid=arr.length/2;
        //Column Arranging
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                 if(i<mid)
                 {
                    for(k=j+1;k<arr[j].length;k++)
                    {
                        if(arr[j][i]<arr[k][i])
                        {
                            int temp=arr[j][i];
                            arr[j][i]=arr[k][i];
                            arr[k][i]=temp;
                        }
                    }
                 }
                 else
                 {
                    for(k=j+1;k<arr[j].length;k++)
                    {
                        if(arr[j][i]>arr[k][i])
                        {
                            int temp=arr[j][i];
                            arr[j][i]=arr[k][i];
                            arr[k][i]=temp;
                        }
                    }
                 }
            }
        }
        //Row Arranging
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                if(i==0 || i==arr.length-1)
                {
                    for(k=j+1;k<arr[j].length;k++)
                    {
                        if(arr[i][j]<arr[i][k])
                        {
                            int temp=arr[i][j];
                            arr[i][j]=arr[i][k];
                            arr[i][k]=temp;
                        }
                    }
                }
                else
                {
                    for(k=j+1;k<arr[j].length;k++)
                    {
                        if(arr[i][j]>arr[i][k])
                        {
                            int temp=arr[i][j];
                            arr[i][j]=arr[i][k];
                            arr[i][k]=temp;
                        }
                    }
                }
            }
        }
        System.out.println("Resultant Matrix");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int arr[][]=new int[row][col];
        int i,j;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
               arr[i][j]=s.nextInt();
            }
        }
        ordering_matrix o =new ordering_matrix();
        o.evaluate_column(arr);
    }
}
