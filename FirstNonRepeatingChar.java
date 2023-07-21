import java.util.*;
public class FirstNonRepeatingChar {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "KidVsKat";
        for(int i = 0 ; i< str.length(); i++){
            int count = 1;
            for(int j = 0; j < str.length(); j++){
                if(i!=j && str.charAt(i)!=str.charAt(j)){
                    continue;
                }
                else if(i!=j){
                    count++;
                }
            }
            if(count==1){
                System.out.print(str.charAt(i));
                break;
            }
        }
    }
}
