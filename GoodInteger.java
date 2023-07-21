import java.util.*;
public class GoodInteger {
    public String largestGoodInteger(String num) {
        if(num.length()<3) return "";

        char []arr=num.toCharArray();
        Arrays.sort(arr);
        int max=0;
        for(int i=arr.length-1;i>=0;i--){
            int count=1, index=i;
            max=0;
            for(int j=i-1;j>=0;j--){
                if(arr[i]==arr[j]&& arr[i]!=' '){
                    arr[j]=' ';
                   count++;
                   max=Math.max(count,max);
                }
                else{
                    count=0;
                    j=-1;
                }
            }
            if(max>=3){
                return num.substring(index-max+1,index+1);
            }
        }
        return "";
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        GoodInteger obj = new GoodInteger();
        System.out.println(obj.largestGoodInteger(num));
    }
}
