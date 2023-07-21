import java.util.Arrays;

public class CoinChange {
    public int generateCoins(int coins[],int cashIndex, int goalCash){
        int count=0;
        while(goalCash!=0 && cashIndex>=0){
            if(goalCash>=coins[cashIndex]){
               goalCash-=coins[cashIndex];
               count++;
            }
            else{
                cashIndex--;
            }
        }
        return count;
    }
    public int generateEqualCoins(int coins[], int coinIndex, int goalCash){
        int count=0;
        while(goalCash>=coins[coinIndex]){
            goalCash-=coins[coinIndex];
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        int coins[]={1,5,6,9};
        int amount=10;
        int dp[][] = new int [coins.length][amount+1];
        CoinChange co = new CoinChange();
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                if(i==0){
                    if(coins[i]>j){
                        dp[i][j]=0;
                    }
                    else{
                        dp[i][j]=co.generateCoins(coins,i,j);
                    }
                }
                else{
                    if(coins[i]>j){
                        dp[i][j]=dp[i-1][j];
                    }
                    else{
                        int temp=j;
                        int count=co.generateEqualCoins(coins,i,j);
                        temp-=count* coins[i];
                        dp[i][j]=Math.min(dp[i-1][j],count+dp[i][temp]);
                    }
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
