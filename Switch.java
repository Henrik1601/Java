import java.util.*;
public class Switch {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[]={0,1,0,1}; int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                arr[i]=0;
            }
            else
            {
                arr[i]=1;
            }
            int consecutive=arr[i+1];
            for(int j=i+1;j<arr.length;j++){
                if(consecutive!=arr[j]){
                    continue;
                }
                else
                {
                    if(arr[j]==1){
                        arr[j]=0;
                    }
                    else
                    {
                        arr[j]=1;
                    }
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
