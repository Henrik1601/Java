import java.util.*;
public class Longest_substring {
    public static void main(String args[])
    {
         Scanner s = new Scanner(System.in);
         String str=s.nextLine();
         char []arr=str.toCharArray();
         char []res=new char[arr.length];
         int position=0,count=0;;
         for(int i=0;i<res.length;i++)
         {
            res[i]='0';
         }
         for(int i=0;i<arr.length;i++)
         {
            if(position==0)
            {
                 if(arr[i]!=arr[i+1])
                 {
                    res[position]=arr[i];
                    res[position+1]=arr[i+1];
                    position+=2;
                    count+=2;
                    i++;
                 }
            }
            else
            {
                for(int j=0;j<=position;j++)
                {
                    if(arr[i]!=res[j])
                    {
                         if(count-position==0)
                         {
                            res[position]=arr[i];
                            position++;
                            count++;
                         }
                    }
                    else{
                        count--;
                        position--;
                        i--;
                    }
                }
            }
         }
         System.out.println(Arrays.toString(res));
    }
    
}
