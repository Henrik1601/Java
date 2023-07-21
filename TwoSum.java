import java.util.*;

public class TwoSum {
    
    public static void main(String args[]){
        int arr[] = {2,7,11,15};
        int target = 9;

        int output[] = new int[2];

        Map <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
              output[0] = map.get(arr[i]);
              output[1] = i;
              break;
            }
            map.put(target-arr[i],i);
        }

        System.out.print(Arrays.toString(output));
    }
}
