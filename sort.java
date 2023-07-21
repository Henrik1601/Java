import java.util.*;
public class sort {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int i,size;
        size=s.nextInt();
        int []arr = new int[size];
        for(i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
