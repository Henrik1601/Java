import java.util.*;
public class assesment17 {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int [][]arr=new int[3][3];
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        int rowmin=0,rowmax=2;
        int colmin=0,colmax=2;
        for(i=rowmin;i<=rowmax;i++)
        {
            System.out.printf("%d ",arr[i][colmin]);
        }
        for(i=rowmax;i>=rowmin;i--)
        {
            System.out.printf("%d ",arr[i][colmin+1]);
        }
        for(i=rowmin;i<=rowmax;i++)
        {
            System.out.printf("%d ",arr[i][colmax]);
        }
    }
}
