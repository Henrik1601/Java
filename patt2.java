import java.util.*;
public class patt2 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        int n=s.nextInt();
        int w=0,ss=0;
        while(t!=0)
        {
            String str;
            Scanner sc=new Scanner(System.in);
            char[]arr=new char[t];
            for(int i=0;i<n;i++)
            {
                 arr[i]=sc.next();
            }
            char p=a.charAt(i)
            if(str=="W")
            {
                 w++;
            }
            else
            {
                 ss++;
            }
            int wall=w*2;
            int bomb=ss*2;
            System.out.println(wall);
            System.out.println(bomb);
            t--;
        }
    }
}
