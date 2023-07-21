import java.util.*;
public class perfect_square {
    int res;
    perfect_square(int val)
    {
          res=val;
    }
    void display(int val,int num)
    {
        System.out.println(res+"*"+res+"="+num);
    }
    public static void main(String args[])
    {
        Scanner s =  new Scanner(System.in);
        int num=s.nextInt();
        int value=0;
        for(int i=1;i<num/2;i++)
        {
            if(i*i==num)
            {
                value=i;
                break;
            }
        }
        if(value==0)
        {
            System.out.println("The number is not a perfect square");
        }
        else
        {
            perfect_square obj = new perfect_square(value);
            obj.display(value,num);
        }
    }
}
