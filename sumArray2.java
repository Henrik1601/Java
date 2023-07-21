
import java.util.*; 
public class sumArray2 {
    public boolean evaluate(int sum,int nums[],int res[]){
        int index=0;
        for(int a : nums){
            if(a==sum){
                res[index++]=sum;
                return true;
            }
        }
        res[index++]=sum;
        return false;
    }
    public void modify(int[]nums,int size,int res[],int sum){
        int count=0;
        for(int i=0;i<size;i++){
            sum+=res[i];
        }
     
     if(evaluate(sum,nums,res)){
        count++;
        if(count==size){
            System.out.println(Arrays.toString(res));
        }
        else{
            modify(nums, size, res, 0);
        }
     }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int nums[]=new int [size];
        int sum=0;
        for(int i=0;i<size;i++){
            nums[i]=s.nextInt();
        }
        sumArray2 obj = new sumArray2();
        int res[]=new int[size];
        for(int i=0;i<size;i++){
            res[i]=1;
         }
        obj.modify(nums,size,res,sum);
    }
}
