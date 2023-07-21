import java.util.*;
class EBCalculator{
    public double calculator(String arr[],int index){
        String [][] str = new String[5][5];
        String domestic ="domestic"; double num=0;
        for(int i=0;i<5;i++){
            str[index][i]=arr[i];
        }
        if(str[index][4].equals(domestic)){
            num=Integer.parseInt(str[index][3]);
            if(num<=100){
                return num*1;
            }
            else if(num>100 && num<=200){
                num=num-100;
                return (100*1)+(2.50*num);
            }
            else if(num>200 && num<=500)
            {
                num=num-200;
                return (100*1)+(2.50*100)+(4*num);
            }
            else{
                num=num-500;
                return (100*1)+(2.50*100)+(4*300)+(6*num);
            }
        }
        return num;
    }
}
public class NightClass3Ex1 extends EBCalculator{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = new String [5];
        int index=0;
        NightClass3Ex1 obj = new NightClass3Ex1();
        for(int i=0;i<5;i++){
            arr[i]=s.nextLine();
        }
        double ans=obj.calculator(arr, index);
        System.out.printf("%.2f",ans);
    }
}
