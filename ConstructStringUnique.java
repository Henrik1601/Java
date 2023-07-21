import java.util.*;
public class ConstructStringUnique {
    char [] shift(char []arr ,int index,int num){
        if(index+num-1<arr.length)
        {
           char a =arr[index];
           arr[index]=arr[index+num-1];
           arr[index+num-1]=a;
        }
        index=index+num-1;
        if(arr[index]!=arr[index+1] && index+1<arr.length){
            return arr;
        }
        else{
            shift(arr, index, num);
        }
        return arr;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int num = s.nextInt();
        char arr[]=str.toCharArray();
        ConstructStringUnique obj = new ConstructStringUnique();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1] && i+1<arr.length){
                obj.shift(arr,i+1,num);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
