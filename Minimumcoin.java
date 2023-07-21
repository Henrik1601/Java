import java.util.*;

public class Minimumcoin {
   public static void main(String args[]){
      int coins[] = {1, 5, 10, 25};
      int n = coins.length;
      int sum = 30;

      System.out.println("Minimum number of coins required: " + minCoins(coins, n, sum));
   }

   static int minCoins(int coins[], int n, int sum) {
      int dp[] = new int[sum + 1];

      Arrays.fill(dp, Integer.MAX_VALUE);

      dp[0] = 0;

      for (int i = 1; i <= sum; i++) {
         for (int j = 0; j < n; j++) {
            if (coins[j] <= i) {
               int subRes = dp[i - coins[j]];

               if (subRes != Integer.MAX_VALUE && subRes + 1 < dp[i])
                  dp[i] = subRes + 1;
            }
         }
      }
      return dp[sum];
   }
}