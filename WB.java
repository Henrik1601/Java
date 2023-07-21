import java.util.*;
public class WB {
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        int t=num.nextInt();
        while(t!=0)
        {
            Scanner s =new Scanner(System.in);
            String str=s.nextLine();
            char []arr=str.toCharArray();
            int size=arr.length;
            int count=0;
            for(int i=0;i<size;i++)
            {
                if(arr[i]=='B')
                {
                    if(i-1>=0 && i-2>=0 && arr[i-1]=='W' && arr[i-2]=='W')
                    {
                        count=count+2;
                        arr[i-1]='A';
                        arr[i-2]='A';
                    }
                    else if(i-1>=0 && arr[i-1]=='W')
                    {
                        count++;
                        arr[i-1]='A';
                    }
                    if(i+1<=size && i+2<=size && arr[i+1]=='W' && arr[i+2]=='W')
                    {
                        count=count+2;
                        arr[i+1]='A';
                        arr[i+2]='A';
                    }
                    else if(i+1<=size && arr[i+1]=='W')
                    {
                        count++;
                        arr[i+1]='A';
                    }
                }
            }
            System.out.println(count);
                t--;
        }
    }
}
