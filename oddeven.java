import java.util.*;
public class oddeven {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int first [] = new int [size];
        int second [] = new int [size];
        int mid=size/2;
        int ans[]= new int [size];
        int trav=0; int left=0,right=1;
        while(trav<=size){
            if(trav==mid){
                ans[mid]=first[mid]*second[mid];
                trav=trav+2;
            }
            else{
                ans[left]=first[left]*second[right];
                ans[right]=first[right]*second[left];
                left=left+3;
                right=right+3;
                trav=trav+2;
            }
            
        }
    }
}
