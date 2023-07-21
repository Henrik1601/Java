import java.util.*;
public class NightClass6Ex4 {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        size=size-1;
        for(int i=0;i<=size;i++){
            if(i==size){
                System.out.print(arr[size]);  
            }
            else{
                System.out.print(arr[size]+" "+arr[i]+" ");
            }
            size--;
        }
    }
}
