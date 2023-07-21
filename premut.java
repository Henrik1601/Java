
import java.util.*; 
public class premut {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        char []arr=str.toCharArray();
        char []sec=arr;
        int size=arr.length;
        int i,j;
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                if(i!=j)
                {
                    char temp=sec[i];
                    sec[i]=sec[j];
                    sec[j]=temp;
                    System.out.println(Arrays.toString(sec));
                }
                sec=arr;
            }
        }
    }
}
