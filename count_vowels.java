import java.util.*;
public class count_vowels {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        char []arr=str.toCharArray();
        int size=arr.length,i,count=0;
        for(i=0;i<size;i++)
        {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
            {
                 count++;
            }
        }
        System.out.println(count);
    }
}
