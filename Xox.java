import java.util.*;
public class Xox {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        char [][]arr=new char[size][size];
        int i,j;
        for(i=0;i<size;i++)
        {
            if(i%2==0)
            {
                for(j=0;j<size;j++)
                {
                    if(j%2==0)
                    {
                        arr[i][j]='X';
                    }
                    else
                    {
                        arr[i][j]='O';
                    }
                }
            }
            else
            {
                for(j=0;j<size;j++)
                {
                    if(j%2==0)
                    {
                        arr[i][j]='O';
                    }
                    else
                    {
                        arr[i][j]='X';
                    }
                }
            }
        }
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                System.out.printf("%c ",arr[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
