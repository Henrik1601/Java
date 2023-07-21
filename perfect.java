import java.util.*;
public class perfect {
    int sum;
    perfect(int sum)
    {
        this.sum=sum;
    }
    void display()
    {
        System.out.println("Perfect number: "+sum);
    }
    
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        perfect obj=new perfect(sum);
        obj.display();
    }
}
