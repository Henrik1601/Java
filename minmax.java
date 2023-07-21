import java.util.*;
public class minmax {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            min=Math.min(min, arr[i]);
            max=Math.max(max,arr[i]);
        }
        int num1=0,num2=0;
        for(int i=0;i<size;i++){
            if(arr[i]==min){
                continue;
            }
            else{
                num1+=arr[i];
            }
        }
        for(int i=0;i<size;i++){
            if(arr[i]==max){
                continue;
            }
            else{
                num2+=arr[i];
            }
        }
        System.out.printf("%d %d",num1,num2);
    }
    
}
