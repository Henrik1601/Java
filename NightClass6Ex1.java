import java.util.*;
public class NightClass6Ex1 {
    public boolean swap(String str,String goal){
        char arr[]=str.toCharArray();
        int pivot=arr.length;
        while(pivot!=0)
        {
            char temp=arr[0];
            for(int i=1;i<arr.length;i++){
               arr[i-1]=arr[i];
            }
            arr[arr.length-1]=temp;
            String ans="";
            for(int i=0;i<arr.length;i++){
                ans=ans+arr[i];
            }
            if(ans.equals(goal)){
                return true;
            }
            pivot--;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str=s.next();
        String goal=s.next();
        NightClass6Ex1 obj = new NightClass6Ex1();
        if(obj.swap(str,goal)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
