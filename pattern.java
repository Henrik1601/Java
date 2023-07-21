import java.util.*;
public class pattern {
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       int n=s.nextInt();
       int i,j,space;
       for(i=0;i<n;i++)
       {
        for(space=0;space<n-(n-i);space++)
        {
            System.out.printf("  ");
        }
        for(j=0;j<n-i;j++)
        {
            System.out.printf("*   ");
        }
        System.out.printf("\n");
       }
    }
}
