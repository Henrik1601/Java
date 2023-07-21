import java.util.*;
public class NightClass5Ex1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int coins[]={1,2,5,10,20,50,100,200,500,2000};
        while(num!=0){
            for(int i=0;i<coins.length;i++){
                if(num==coins[i]){
                    num=num-coins[i];
                    System.out.print(coins[i]+" ");
                    i=coins.length;
                }
                else if(num<coins[i]){
                    num=num-coins[i-1];
                    System.out.print(coins[i-1]+" ");
                    i=coins.length;
                }
            }
        }
    }
}
