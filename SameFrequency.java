import java.util.*;
public class SameFrequency{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char arr[]=str.toCharArray();
        String temp="";
        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;i++){
                if(count==1){
                    if(arr[i]==arr[j]){
                        temp=temp+arr[i];
                        count++;
                    }
                }
                else
                {
                    
                }
            }
        }
    }
}