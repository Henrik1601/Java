import java.util.*;
public class NightClass5Ex2 {
    public int possibility(int coins[],int sum,int gets,int arr[]){
        int letout=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+coins[i];
            if(arr[i]==4){
               gets++;
            }
            if(arr[i]>sum){
               letout++;
            }
            if(letout==arr.length){
                break;
            }
            if(arr[i]<sum){
                possibility(coins, sum, gets,arr);
            }
        }
        return gets;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int sum=s.nextInt();
        int N =s.nextInt();
        int coins[]=new int[N];
        for(int i=0;i<N;i++){
             coins[i]=s.nextInt();
        }
        NightClass5Ex2 obj = new NightClass5Ex2();
        int gets=0;
        int arr[]=new int[coins.length];
        for(int i=0;i<coins.length;i++){
           arr[i]=0;
        }
        gets+=obj.possibility(coins,sum,gets,arr);
        System.out.print(gets);
    }
}
