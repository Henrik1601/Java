import java.util.*;
public class zigzag_conversion {
    public String converting(String str,int num)
    {
        char arr[]=str.toCharArray();
        char temp[][]=new char[num][arr.length];
        int row=0,col=0,cur=0;
        while(cur<arr.length)
        {
            while(row<num && cur<arr.length)
            {
                temp[row++][col]=arr[cur++];
            }
            row=Math.max(0,row-2);
            while(row>0 && cur<arr.length)
            {
                temp[row--][++col]=arr[cur++];
            }
            col++;
        }
        String ans="";
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                ans+=temp[i][j];
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner s =  new Scanner(System.in);
        String sr = s.nextLine();
        zigzag_conversion obj = new zigzag_conversion();
        String ans=obj.converting(sr,3);
        System.out.println(ans);
    }
}
