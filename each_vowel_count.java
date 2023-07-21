import java.util.*;
class eachvowel
{
    public void count_vowel(char character,char []arr,int size)
    {
        int i,flag=0;
        for(i=0;i<size;i++)
        {
            if(character==arr[i])
            {
                 flag++;
                 arr[i]='0';
            }
        }
        System.out.printf("Character %c has it's frequency %d\n",character,flag);
    }
}
public class each_vowel_count {
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char []arr=str.toCharArray();
        int size=arr.length,i,j,count=0;
        for(i=0;i<size;i++)
        {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
            {
                count++;
            }
        }
        System.out.println(count);
        eachvowel obj =new eachvowel();
        char []character={'a','e','i','o','u'};
        int vowel_size=character.length;
        for(i=0;i<size;i++)
        {
            for(j=0;j<vowel_size;j++)
            {
                if(arr[i]==character[j])
                {
                    obj.count_vowel(character[j],arr,size);
                }
            }
        }
    }
}
