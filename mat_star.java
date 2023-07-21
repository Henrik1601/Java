import java.util.*;
public class mat_star {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int i,j;
        int n=s.nextInt();
        char arr[][]=new char[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=s.next().charAt(0);
            }
        }
        int mid=(n/2);
        char swift=arr[mid][mid];
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(j=0;j<n;j++)
                {
                  if(j%2==0)
                  {
                    int temp=((arr[i][j]-48)+swift);
                    char res;
                    if(temp>9)
                    {
                        res=(char)(temp);
                    }
                    else
                    {
                        res=(char)(temp);
                    }
                    arr[i][j]=res;
                  }
                  else
                  {
                    arr[i][j]='*';
                  }
                }
            }
            else
            {
                for(j=0;j<n;j++)
                {
                    if(j%2==0)
                    {
                        arr[i][j]='*';
                    }
                    else
                    {
                        arr[i][j]=(char)((arr[i][j]-48)+swift);
                    }
                }
            }
        }
        arr[mid][mid]=swift;
        System.out.println("Resultant Matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.printf("%c ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
