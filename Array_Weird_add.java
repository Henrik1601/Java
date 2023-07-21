import java.util.*;
public class Array_Weird_add {
    public void addition(int []first,int[]second)
    {
        int size=first.length+Math.abs(first.length-second.length);
        int result[]=new int[size];
        int index=size-1,carry=0,temp=0;
        for(int i=size-1;i>=0;i--)
        {
            if(i>=first.length)
            {
                first[i]=0;
            }
            else if(i>=second.length)
            {
                second[i]=0;
            }
            result[index]=first[i]+second[i]+carry;
            if(result[index]>=10)
            {
                temp=result[index];
                result[index]=temp%10;
                carry=temp/10;
            }
            else
            {
                temp=0;
                carry=0;
            }
            index--;
        }
        Array_Weird_add obj = new Array_Weird_add();
        obj.display(result);
    }
    void display(int []result)
    {
        for(int i=0;i<result.length;i++)
        {
            System.out.printf("%d ",result[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int fin=s.nextInt();
        int sen=s.nextInt();
        int first[]=new int[fin];
        int second[]=new int[sen];
        for(int i=0;i<fin;i++)
        {
            first[i]=s.nextInt();
        }
        for(int i=0;i<sen;i++)
        {
            second[i]=s.nextInt();
        }
        Array_Weird_add obj = new Array_Weird_add();
        obj.addition(first,second);
    }
}
