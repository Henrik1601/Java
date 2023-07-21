import java.util.*;
public class LongCommonPreffix {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        String []arr= new String[size];
        int i,j;
        for(i=0;i<size;i++)
        {
            arr[i]=s.nextLine();
        }
        String temp=arr[0];
        char []res= new char[10];
        char []cmp=temp.toCharArray();
        int index=0;
        for(i=1;i<cmp.length;i++)
        {
            char []another=arr[i].toCharArray();
            j=0;
            for(j=0;j<another.length;j++)
            {
                if(cmp[j]==another[j])
                {
                    res[index]=cmp[j];
                    index++;
                }
                if(res[j]==' ')
                {
                    j=another.length;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
