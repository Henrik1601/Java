import java.util.*;
public class Assessment4Ascii {
    public boolean Remove(char arr[],int index){
        int num=arr[index];
        if(num>95 && num<122){
            int dest=arr[index]-32;
            if(arr[index+1]==dest){
                return true;
            }
        }
        else if(num>63 && num<80){
            int dest=arr[index]+32;
            if(arr[index+1]==dest){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        char arr[]=in.toCharArray();
        Assessment4Ascii obj = new Assessment4Ascii();
        for(int i=0;i<arr.length-1;i++){
            if(obj.Remove(arr,i)){
                arr[i]='0';
                arr[i+1]='0';
                i++;
            }
            else{
                continue;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='0'){
                System.out.printf("%c",arr[i]);
            }
        }
    }
}
