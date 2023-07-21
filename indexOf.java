import java.util.Arrays;

public class indexOf {
    public int BS (int nums[], int target){
        int start=0, end = nums.length-1;
        int mid = start + (end - start)/2;
        while (start <= end){
            if(nums[mid] == target){
                return mid;
            }
            else if(target < mid){
                end = mid-1;
            }
            else if(target > mid){
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        indexOf index = new indexOf();
        int res = index.BS(nums, target);
        System.out.println(res);
    }
}
