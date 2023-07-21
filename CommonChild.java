import java.util.Arrays;

public class CommonChild {
    
    public static void main(String args[]){
        String str1 = "HARRY";
        String str2 = "SALLY";
        int dp[][] = new int [str1.length()+1][str2.length()+1];
        for(int i=0;i<str1.length()+1;i++){
            for(int j=0;j<str2.length()+1;j++){
                if(i==0 && j==0){
                    dp[i][j] = 0;
                }
                else if(i==0 && j!=0){
                    dp[i][j] = 0;
                }
                else if(i!=0 && j==0){
                    dp[i][j] = 0;
                }
                else{
                    if(str1.charAt(i-1)==str2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1]+1;
                    }
                    else{
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
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

        System.out.print("CommonChild: "+dp[str1.length()][str2.length()]);
    }
}
