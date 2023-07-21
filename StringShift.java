import java.util.*;
public class StringShift {
    public boolean rotateString(String s, String goal) {
        int move=0;
        char arr[]=s.toCharArray();
        while(move!=arr.length)
        {
            swift(arr);
            String neww="";
            for(char c : arr){
               neww+=c;
            }
            System.out.println(neww);
            if(neww.equals(goal)){
               return true;
            }
            else{
               move++;
            }
        }
        return false;
    }
    public char []swift(char[]arr){
        char temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
            if(i==arr.length-1){
                arr[i]=temp;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String goal = sc.nextLine();
        System.out.println();
        StringShift obj =new StringShift();
        System.out.println(obj.rotateString(s, goal));
    }
}
