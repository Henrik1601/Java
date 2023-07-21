import java.util.*;
public class Assessment11Ex2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str=s.next();
        char arr[]=str.toCharArray();
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            String first="";
            for(int j=0;j<str.length();j++){
                if(j!=i){
                    first=first+arr[j];
                }
            }
            int remove=i+1;
            while(remove!=arr.length){
                String second="";
                for(int j=0;j<arr.length;j++){
                    if(j!=remove){
                       second=second+arr[j];
                    }
                }
                if(second.equals(first)){
                  count++;
                }
                remove++;
            }
        }
        System.out.println(count);
    }
}
