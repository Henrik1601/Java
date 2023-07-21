import java.util.*;
public class parklot {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int mat[][]= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               mat[i][j]=s.nextInt();
            }
        }
        int count=0,max=0,lot=0;
        for(int i=0;i<row;i++){
            count=0;
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(max<count){
                max=count;
                lot=i+1;
            }
        }
        System.out.println(lot);
    }
}
