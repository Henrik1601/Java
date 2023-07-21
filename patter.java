import java.util.*;
public class patter {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t!=0)
        {
            int start=2;
            int n=s.nextInt();
            int end=(n*2)-1;
            for(int i=1;i<=n;i++)
            {
                for(int j=0;j<=(n*2)+1;j++)
                {
                    if(j>=start && j<=end)
                    {
                        System.out.printf("#");
                    }
                    else
                    {
                        System.out.printf("*");
                    }
                }
                start++; end--;
                System.out.println();
            }
        }
    }
}
