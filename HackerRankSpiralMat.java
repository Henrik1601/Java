import java.util.*;
public class HackerRankSpiralMat {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int grid[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        
        int rowmin = 0 , rowmax = 2;
        int colmin = 0 , colmax = 2;
        int result[] = new int[9];
        int index = 0;
        while(rowmin <= rowmax ){
            
            for(int i=colmin;i<=colmax;i++){
                result[index++] = grid[rowmin][i];
            }
            
            for(int i=rowmin+1;i<=rowmax;i++){
                result[index++] = grid[i][colmax];
            }
            
            if(colmin < colmax){
                for(int i=colmax-1;i>=colmin;i--){
                    result[index++] = grid[rowmax][i];
                }
            }
            
            if(rowmin < rowmax){
                for(int i=rowmax-1;i>=rowmin+1;i--){
                    result[index++] = grid[i][colmin];
                }
            }
            rowmin++; rowmax--;
            colmin++; colmax--;
        }
        System.out.print(Arrays.toString(result));
    }
}
