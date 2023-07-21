import java.util.*;
public class OddEvenNumber {
    
    public static void main(String args[]){
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                for(int j=0;j<arr.length;j++){
                    if(i!=j && (arr[j]%2!=0)){
                       int temp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = temp;
                       j=arr.length;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
