import java.util.*;
public class SantaElf {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        int ans=0;
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
            arr[i]=(arr[i]/3)-2;
            ans+=arr[i];
        }
        System.out.println(ans);
    }
}
