import java.util.*;
public class diamond {
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int size=num*2-1;
        int i,j,space;
        for(i=0;i<size;i++)
        {
            if(i<num)
            {
                for(space=0;space<num-i-1;space++)
                {
                     System.out.printf("  ");
                }
                for(j=0;j<num-space;j++)
                {
                     System.out.printf("*   ");
                }
            }
            else
            {
                for(space=0;space<i-(num-1);space++)
                {
                    System.out.printf("  ");
                }
                for(j=0;j<num-space;j++)
                {
                    System.out.printf("*   ");
                }
            }
            System.out.printf("\n");
        }
    }
}
