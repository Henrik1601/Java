import java.util.*;
public class Intcode {
    public int [][] addition(int [][]mat,int first,int []arr){
          for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int num1=arr[mat[first][1]]*arr[mat[first][2]];
                mat[first][3]=num1;
            }
          }
          return mat;
    }
    public int [][] multiplication(int [][]mat,int first,int[] arr){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int num1=arr[mat[first][1]]*arr[mat[first][2]];
                mat[first][3]=num1;
            }
          }
        return mat;
  }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int index=0;
        int mat[][] = new int[4][4];
        for(int i = 0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=arr[index]; index++;
                if(mat[i][j]==99){
                    break;
                }
            }
        }
        Intcode obj = new Intcode();
        int first=0;
        while(first<4)
        {
            if(mat[first][0]==1||mat[first][first]==1){
                obj.addition(mat,first,arr);
            }
            else if(mat[first][0]==2||mat[first][first]==2)
            {
                obj.multiplication(mat,first,arr);
            }
            else if(mat[first][0]==99){
                break;
            }
            first++;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.printf("%d ",mat[i][j]);
            }
            System.out.println();
        }
    }
}
