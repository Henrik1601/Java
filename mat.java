import java.util.*;
class mat
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int n,i,j;
        switch(num)
        {
            default: n=0; break;
            case 2: n=num; break;
            case 3: n=num; break;
            case 4: n=num; break;
            case 5: n=num; break;
        }

             for(i=0;i<n;i++)
             {
                for(j=0;j<n;j++)
                {
                    if(i==j || i+j==n-1)
                    {
                    System.out.printf("* ");
                    }
                    else if(i==0||i==n-1||j==0||j==n-1)
                    {
                        System.out.printf("* ");
                    }
                    else
                    {
                        System.out.printf("  ");
                    }
                }
                System.out.printf("\n");
             }
        }
 }