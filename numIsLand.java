import java.util.*;
class Island{

    public int verify(char[][]grid)
    {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1');
                {
                    count+=1;
                    convert(grid,i,j);
                }
            }
        }
        return count;
    }
    public void convert(char [][]grid,int i,int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0')
          return;
        
        grid[i][j]='0';
        convert(grid,i+1,j);
        convert(grid,i-1,j);
        convert(grid,i,j-1);
        convert(grid,i,j+1);
    }
}
public class numIsLand {
    
    public static void main(String args[]){
        char grid[][]={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        Island obj = new Island();
        int count=obj.verify(grid);
        System.out.println(count);
    }
}
