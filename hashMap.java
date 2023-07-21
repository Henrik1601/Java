import java.util.*;
public class hashMap {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int indexArr[] = new int[11];
        int valArr[] = new int[11];
        for(int i=0;i<11;i++){
            indexArr[i] = s.nextInt();
            valArr[i] = s.nextInt();
        }
        int start=indexArr[0];
        int end=valArr[0];
        System.out.printf("(%d %d), ",start,end);
        for(int i=1;i<11;i++){
            if(indexArr[i]>=start && indexArr[i]>=end){
                start = indexArr[i];
                end = valArr[i];
                System.out.printf("(%d %d), ",start,end);
            }
        }
    }
}
