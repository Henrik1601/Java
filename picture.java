import java.util.*;
public class picture {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int l=s.nextInt();
        int dim=s.nextInt();
        int [][]arr=new int[dim][2];
        int i,j;
        for(i=0;i<dim;i++)
        {
            for(j=0;j<2;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        for(i=0;i<dim;i++)
        {
            for(j=0;j<2;j++)
            {
                if(arr[i][j] >l && arr[i][j+1] >l)
                {
                    if(arr[i][j] == arr[i][j+1])
                {
                    System.out.printf("ACCEPTED\n");
                }
                   else
                   {
                    System.out.printf("CROP IT\n");
                   }
                }
                else if(arr[i][j] <l || arr[i][j+1] <l)
                {
                    System.out.printf("UPLOAD ANOTHER\n");
                }
                else if(arr[i][j]==l && arr[i][j+1]==l)
                {
                    System.out.printf("ACCEPTED\n");
                }
                j++;
            }
        }
    }
}
