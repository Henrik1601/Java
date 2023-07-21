import java.util.*;
public class NightClass6Ex5 {
   public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int size=s.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=s.nextInt();
    }
    for(int i=0;i<size;i++){
        int count=0,length=0;
        for(int j=i+1;j<size;j++){
            length++;
            if(arr[i]>arr[j]){
               count++;
            }
        }
        if(count==length){
           System.out.print(arr[i]+" ");
        }
    }
   } 
}
