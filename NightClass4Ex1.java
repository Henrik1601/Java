import java.util.*;
public class NightClass4Ex1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int k =s.nextInt();int max=0;
        int count=0;
        for(int i=0;i<size;i++){
            int j=i;
            while(j<i+k && i+k<=size){
                max=Math.max(max,arr[j]);
                j++;
            }
            if(count==size-k){
                break;
            }
            System.out.print(max+" ");
            count++;
            max=0;
        }
    }
}
