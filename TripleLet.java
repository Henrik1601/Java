import java.util.*;
public class TripleLet {
    
    public static void main(String args[]){
        int arr[] = {0,-1,2,-3,1};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<arr.length-2;i++) {
            for(int j =1;j<arr.length-1;j++){
                for(int k=2;k<arr.length;k++){
                    ArrayList<Integer,Integer,Integer> temp = new ArrayList<>();
                    if(arr[i]+arr[j]+arr[k]==0){
                        temp.add(arr[i],arr[j],arr[k]);
                    }
                }
                temp.clear();
            }
        }
        System.out.print(list);
    }
}
