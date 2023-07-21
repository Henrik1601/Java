import java.util.*; //Transpose//
public class philips1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int row=s.nextInt(); int col=s.nextInt();
        int mat[][]=new int [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=s.nextInt();
            }
        }
        int temp[][]=new int[row][col];
        int rowmin=0,rowmax=row-1;
        int colmin=0,colmax=col-1;
        int k=rowmin,tempcol=colmin;
        while(rowmin<=rowmax){
            k=0;
            for(int i=colmin;i<=colmax;i++){
                temp[rowmin][i]=mat[k++][tempcol];
            }
            tempcol++;
            rowmin++;
        }
        int ans[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[i][j]=0;
                for(int l=0;l<row;l++){
                    ans[i][j]+=mat[i][l]*temp[l][j];
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("%d ",ans[i][j]);
            }
            System.out.println();
        }
    }
}
