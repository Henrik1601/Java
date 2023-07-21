import java.util.*;
public class Assessment11Ex1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[]=new int[size];
        int fuel=0;
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int position=s.nextInt();
        for(int i=0;i<size;i++){
                fuel+=Math.abs(position-arr[i]);
        }
        System.out.println(fuel);
    }
}
