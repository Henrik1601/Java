import java.util.*;
public class pascal {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int i,j,space;
        for(i=0;i<num;i++)
        {
            if(i<num)
            {
              for(space=0;space<num-i-1;space++)
              {
                  System.out.printf("  ");
              }
              int size=num-space+i;
              int mid=(size/2)+1;
              for(j=0;j<size;j++)
              {
                  if(j<mid)
                  {
                     System.out.printf("%d ",j+1);
                  }
                  else
                  {
                      mid--;
                      System.out.printf("%d ",mid);
                  }
               }
            System.out.printf("\n");
            }
        }
    }
}
