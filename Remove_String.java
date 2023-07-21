import java.util.*;
public class Remove_String {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        char[]arr=str.toCharArray();
        int size=arr.length;
        String compare=s.nextLine();
        char[]arr1=compare.toCharArray();
        int num=arr1.length,i,j,in=0,ind=0,position=0,count=0;
        while(count<num && in<=size)
        {
            if(arr[in]==arr1[ind])
            {
                count++;
                ind++;
                position=in;
            }
            else
            {
                count=0;
            }
            in++;
        }
        if(count==num)
        {
            for(i=0;i<size;i++)
            {
                if(i>=position-(count-1) && i<=position)
                {
                    continue;
                }
                else
                {
                    System.out.print(arr[i]);
                }
            }
        }
        else
        {
            System.out.println("The given String is not present in the Original String");
        }
    }
}