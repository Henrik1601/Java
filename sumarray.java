import java.util.*;
class sumarray{

    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       int size=s.nextInt();
       int arr[][]=new int[size][size];
       int i,j;
       for(i=0;i<size;i++)
       {
        for(j=0;j<size;j++)
        {
            arr[i][j]=s.nextInt();
        }
       }
       for(i=0;i<size;i++)
       {
           for(j=0;j<size;j++)
           {
              if(j+2<size)
              {
                if(j==0)
                {
                    arr[i][j]=arr[i][j+1]+arr[i][j+2];
                }
              }
              else if(j==1)
              {
                    arr[i][j]=arr[i][j+1]-arr[i][j];
              }
           }
       }
       System.out.println("Resultant Matrix:");
       for(i=0;i<size;i++)
       {
        for(j=0;j<size;j++)
        {
            System.out.printf("%d ",arr[i][j]);
        }
        System.out.println();
       }
    }
}