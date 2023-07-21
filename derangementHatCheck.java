import java.util.*;
public class derangementHatCheck{
    public int derangement(int num){
        if(num==1 || num==2){
            return num-1;
        }
        return (num-1)*((derangement(num-1)+derangement(num-2)));
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        derangementHatCheck hat = new derangementHatCheck();
        System.out.println(hat.derangement(num));
    }
}