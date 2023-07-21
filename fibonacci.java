import java.util.Arrays;

public class fibonacci {
    
    public static void main(String args[]){
        int firstElement=0;
        int secondElement=1;
        int num=4;
        int arr[] = new int[num-1];
        int index=0;
        for(int i=0;i<num-1;i++){
            int res=firstElement+secondElement;
            arr[index++]=res;
            firstElement=secondElement;
            secondElement=res;
        }
        System.out.println(Arrays.toString(arr));
    }
}
