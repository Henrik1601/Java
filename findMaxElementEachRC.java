public class findMaxElementEachRC {
    public int rowMax(int [][]grid, int row){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<grid[0].length;i++){
           if(max < grid[row][i]){
              max = grid[row][i];
           }
        }
        return max;
    }
    public int colMax(int [][]grid, int col){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            if(max<grid[i][col]){
                max = grid[i][col];
            }
        }
        return max;
    }
    
    public static void main(String args[]){
        int grid[][] = {{1,2,3},{4,5,6},{7,8,9}};
        findMaxElementEachRC find = new findMaxElementEachRC();
        System.out.println("RowMax Value: ");
        for(int row =0; row<grid.length;row++){
            System.out.print(find.rowMax(grid,row)+" ");
        }
        System.out.println();
        System.out.println("ColMax Value: ");
        for(int col=0; col<grid[0].length; col++){
            System.out.print(find.colMax(grid,col)+" ");
        }
    }
}
