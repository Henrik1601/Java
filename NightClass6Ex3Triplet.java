import java.util.*;
public class NightClass6Ex3Triplet {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int size=s.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=s.nextInt();
    }
    int count=0;
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            int temp=arr[i]+arr[j];
            for(int k=0;k<size;k++){
                if(temp==arr[k]){
                   count++;
                   k=size;
                }
            }
        }
    }
    System.out.println(count);
  }  
}
