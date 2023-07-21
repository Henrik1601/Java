import java.util.Arrays;

public class BreakingBad {
    
    public static void main(String args[]){
        String str = "BreakBad";
        int indexArr[] = new int[str.length()];
        int index = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='B'){
               indexArr[index++] = i;
            }
        }
        int size = Math.max(indexArr[0], indexArr[1]);
        for(int i=0;i<size;i++){
            for(int j=indexArr[0];j<=i && j<indexArr[1];j++){
               System.out.print(str.charAt(j));
            }
            for(int j=indexArr[1];j<=i+indexArr[1] && j<str.length();j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
