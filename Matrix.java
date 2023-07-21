import java.util.*;
class sizeCheck{
    public boolean similarity(int size1,int size2){
        if(size1!=size2){
            return false;
        }
        return true;
    }
    public void add(int [][]mat,int[][]other){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                mat[i][j]=mat[i][j]+other[i][j];
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class Matrix extends sizeCheck {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int matSize1=s.nextInt();
        int matSize2=s.nextInt();
        Matrix obj = new Matrix();
        if(!obj.similarity(matSize1, matSize2)){
           System.exit(0);
        }
        int mat[][]=new int[matSize1][matSize1];
        for(int i=0;i<matSize1;i++){
            for(int j=0;j<matSize1;j++){
               mat[i][j]=s.nextInt();
            }
        }
        int other[][]=new int[matSize2][matSize2];
        for(int i=0;i<matSize2;i++){
            for(int j=0;j<matSize2;j++){
               other[i][j]=s.nextInt();
            }
        }
        obj.add(mat,other);
    }
}
