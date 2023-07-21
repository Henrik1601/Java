import java.util.*;
public class maxproduct {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int last=arr[arr.length-1];
        int prev=arr[arr.length-2];
        int ans=(last*prev)-(last+prev)+1;
        System.out.printf("%d",ans);
    }
}
