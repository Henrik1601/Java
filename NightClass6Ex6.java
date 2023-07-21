import java.util.*;
public class NightClass6Ex6 {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int size=s.nextInt();
        String []arr=new String[size];
        for(int i=0;i<size;i++){
            arr[i]=s.next();
            System.out.println(arr[i]);
        }
        int index=0;
        char alphabet[]=new char[26];
        for(int i=97;i<=96+26;i++){
            alphabet[index]=(char)i;
            System.out.println(alphabet[index]);
            index++;
        }
        for(int i=0;i<size;i++)
        {
            int in=0;
            char temp[]=arr[i].toCharArray();
            for(int j=0;i<alphabet.length;j++){
                if(temp[in++]==alphabet[j]){
                    
                }
            }
        }
    }
}
