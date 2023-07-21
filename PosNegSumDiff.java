import java.util.*;
public class PosNegSumDiff {
    
    public static void main(String args[]){
        int intArr[] = {-1,5,-2,3,-1};
        HashSet<Integer> set = new HashSet<>();
        int posSum = 0, negSum = 0;
        for(int i=0;i<intArr.length;i++){
           set.add(intArr[i]);
        }
        Object newArr[] = set.toArray();
        for(int i=0;i<newArr.length;i++){
          if((int)newArr[i]>=0){
            posSum += (int)newArr[i];
          }
          else{
            negSum += (int)newArr[i];
          }
        }
        System.out.print(posSum+negSum);
    }
}
