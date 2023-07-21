import java.util.*;
public class RainWater {
    public int capacity(int []arr,int pos){
       int ans=0;
       int j=pos+1;
       int count=arr[pos];
       while(arr[pos]>arr[j] && j<arr.length-1){
        if(count==arr[j]){
            j++;
            count=arr[pos];
        }
        else{
            count--;ans++;
        }
       }
        return ans;
    }
    public int move(int []arr,int pos){
        int skip=0;
        int j=pos+1;
        int count=arr[pos];
        while(arr[pos]>arr[j] && j<arr.length-1){
         if(count==arr[j]){
             j++;
             skip++;
             count=arr[pos];
         }
         else{
            count--;
         }
        }
         return skip;
     }
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       int size=s.nextInt();
       int arr[] = new int[size];
       RainWater obj = new RainWater();
       int ans=0,skip=0;
       for(int i=0;i<size;i++){
        arr[i]=s.nextInt();
       }
       for(int i=0;i<size-1;i++){
        if(arr[i]>arr[i+1]){
            if(i==0 && arr[i]==0){
                continue;
            }
            else{
                ans+=obj.capacity(arr, i);
                skip+=obj.move(arr,i);
            }
            if(skip!=1){
                i=i+skip-1;
            }
        }
       }
       System.out.println(ans);
    }
}
