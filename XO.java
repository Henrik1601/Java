import java.util.*;
public class XO {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int i,j;
        int rowmin=0, rowmax=n-1;
        int colmin=0, colmax=m-1;
        String[][]arr=new String[n][m];
        while(rowmin<=rowmax && colmin<=colmax)
        {
            if(rowmax%2!=0 && colmax%2==0)
            {
                 for(i=colmin;i<=colmax;i++)
                 {
                    arr[rowmin][i]="X";
                 }
                 for(i=rowmin+1;i<=rowmax;i++)
                 {
                    arr[i][colmax]="X";
                 }
                 for(i=colmax-1;i>=colmin;i--)
                 {
                    arr[rowmax][i]="X";
                 }
                 for(i=rowmax-1;i>=rowmin+1;i--)
                 {
                    arr[i][colmin]="X";
                 }
            }
            else if(rowmax%2==colmax%2)
            {
                 if(rowmax%2==0 && colmax%2==0)
                 {
                    for(i=colmin;i<=colmax;i++)
                 {
                    arr[rowmin][i]="X";
                 }
                 for(i=rowmin+1;i<=rowmax;i++)
                 {
                    arr[i][colmax]="X";
                 }
                 for(i=colmax-1;i>=colmin;i--)
                 {
                    arr[rowmax][i]="X";
                 }
                 for(i=rowmax-1;i>=rowmin+1;i--)
                 {
                    arr[i][colmin]="X";
                 }
                 }
                 else
                 {
                    for(i=colmin;i<=colmax;i++)
                {
                   arr[rowmin][i]="O";
                }
                for(i=rowmin+1;i<=rowmax;i++)
                {
                   arr[i][colmax]="O";
                }
                for(i=colmax-1;i>=colmin;i--)
                {
                   arr[rowmax][i]="O";
                }
                for(i=rowmax-1;i>=rowmin+1;i--)
                {
                   arr[i][colmin]="O";
                }
                 }
            }
            else
            {
                for(i=colmin;i<=colmax;i++)
                {
                   arr[rowmin][i]="O";
                }
                for(i=rowmin+1;i<=rowmax;i++)
                {
                   arr[i][colmax]="O";
                }
                for(i=colmax-1;i>=colmin;i--)
                {
                   arr[rowmax][i]="O";
                }
                for(i=rowmax-1;i>=rowmin+1;i--)
                {
                   arr[i][colmin]="O";
                }
            }
            rowmin++; rowmax--;
            colmin++;colmax--;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
