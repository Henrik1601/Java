import java.util.*;
public class minimunNoOfCoin {
    public ArrayList<Integer> generateCoins(int coins[],int index,int cash){
        ArrayList<Integer> list = new ArrayList<>();
        while(cash!=0)
        {
            if(cash>=coins[index]){
                cash-=coins[index];
                list.add(coins[index]);
            }
            else{
                index--;
            }
        }
        return list;
    }
    public static void main(String args[]){
        int coins[]={1,5,6,9};
        int cash=11;
        minimunNoOfCoin co = new minimunNoOfCoin();
        ArrayList <ArrayList<Integer>> list = new ArrayList<>();
        for(int i=coins.length-1;i>=0;i--){
            list.add(co.generateCoins(coins, i, cash));
        }
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<list.size();i++){
           if(min>list.get(i).size()){
              min=list.get(i).size();
              index=i;
           }
        }
        System.out.println(list.get(index));
    }
}
