import java.util.*;
public class mat_gen {
    
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        int i,j,count=1;
        int [][]arr=new int[num][num];
        for(i=0;i<num;i++)
        {
            if(i%2==0)
            {
               for(j=0;j<num;j++)
               {
                   arr[j][i]=count;
                   count++;
               }
            }
            else
            {
                for(j=num-1;j>=0;j--)
                {
                    arr[j][i]=count;
                    count++;
                }
            }
        }
        for(i=0;i<num;i++)
        {
            for(j=0;j<num;j++)
            {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
