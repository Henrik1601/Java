import java.util.*;
public class RearrangeTheStringToD {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        char arr[] = str.toCharArray();
        System.out.println(arr.length);
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i]==arr[i+1] && i!=arr.length){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i+1]!=arr[j])
                    {
                        char c = arr[i+1];
                        arr[i+1]=arr[j];
                        arr[j]=c;
                        j=arr.length;
                    }
                }
            }
        }
        for(int i =arr.length-1;i>0;i--){
            if(arr[i]==arr[i-1]){
                for(int j=i-1;j>=0;j--){
                    if(arr[i-1]!=arr[j]){
                        char c = arr[i-1];
                        arr[i-1]=arr[j];
                        arr[j]=c;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
