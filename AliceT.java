import java.util.*;
public class AliceT {
   public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int arr[] = new int[num];
    for(int i=0;i<num;i++){
        arr[i]=s.nextInt();
    }
    int message=arr[0];
    int count=0;
    for(int i=1;i<num;i++){
        if(arr[i]==message)
        {
            continue;
        }else{
            count++;
        }
    }
    System.out.println(count);
   } 
}
