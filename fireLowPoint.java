import java.util.*;
public class fireLowPoint {
    public boolean fourdirection(int [][]arr,int index1,int index2){
        if(index1==0){
            if(arr[index1][index2]<arr[index1+1][index2] && arr[index1][index2]<arr[index1][index2+1]){
                return true;
            }
        }
        else if(index1+1<arr.length){
            if(arr[index1][index2]<arr[index1-1][index2] && arr[index1][index2]<arr[index1][index2-1] && arr[index1][index2]<arr[index1][index2+1]){
                return true;
            }
        }
        else if(index2-1<0){
            if(arr[index1][index2]<arr[index1+1][index2] && arr[index1][index2]<arr[index1-1][index2] && arr[index1][index2]<arr[index1][index2+1]){
                return true;
            }
        }
        else if(index2+1>arr[0].length){
            if(arr[index1][index2]<arr[index1+1][index2] && arr[index1][index2]<arr[index1-1][index2] && arr[index1][index2]<arr[index1][index2-1]){
                return true;
            }
        }
        else{
            if(arr[index1][index2]<arr[index1+1][index2] && arr[index1][index2]<arr[index1-1][index2] && arr[index1][index2]<arr[index1][index2+1]&& arr[index1][index2]<arr[index1][index2-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        fireLowPoint obj = new fireLowPoint();
        int mat[][] = new int[5][10];
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                mat[i][j]=s.nextInt();
            }
        }
        int ans=0;
        for(int i=0;i<4;i++){
            for(int j=1;j<10;j++){
                if(obj.fourdirection(mat,i,j)){
                   ans+=mat[i][j]+1;
                }
            }
        }
        System.out.println(ans);
    }
}
