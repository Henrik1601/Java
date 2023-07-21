import java.util.*;
public class singleswap {
    public boolean verify(String str1,String str2,int index)
    {
        int j=index+1;
        while(j<str2.length()){
            char arr[]=str2.toCharArray();
            char temp=arr[index];
            arr[index]=arr[j];
            arr[j]=temp;
            String ans="";
            for(int i=0;i<arr.length;i++){
                ans+=arr[i];
            }
            if(ans.equals(str1)){
                return true;
            }
            j++;
        }
        return false;
    }
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       String str1=s.next();
       String str2=s.next();
       singleswap obj = new singleswap();
       char first[]=str1.toCharArray();
       char second[]=str2.toCharArray();
       int last=0;
       for(int i=0;i<str2.length()-1;i++){
        if(obj.verify(str1,str2,i)){
            System.out.println("YES");
            last++;
            break;
           }
       }
       if(last!=1){
        System.out.println("No");
       }
    }
}
