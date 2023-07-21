import java.util.*;
public class addDigits {
    public int recursion(int num){
        int temp=0,Digits=0;
       while(num!=0){
          temp+=(num%10);
          Digits++;
          num/=10;
       }
       if(Digits==1){
        return temp;
       }else{
        temp=recursion(temp);
       }
       return temp;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        addDigits obj = new addDigits();
        System.out.println(obj.recursion(num));
    }
}
