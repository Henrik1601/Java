import java.util.*;
public class elftree {
   
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int tree[][] = new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                tree[i][j]=s.nextInt();
            }
        }
        int rowmin=1,rowmax=num-2;
        int colmin=1,colmax=num-2;
        int outer=num+(num-1)+(num-1)+(num-2);
        int count=0;
        while(rowmin<=rowmax && colmin<=colmax){
            for(int i=colmin;i<=colmax;i++){
                if(tree[rowmin][i]<tree[rowmin-1][i]){
                     count++;
                }
            }
            rowmin++;
            for(int i=rowmin;i<=rowmax;i++){
                if(tree[i][colmax]<tree[i][colmax+1]){
                    count++;
                }
            }
            colmax--;
            if(rowmin<=rowmax)
            {
            for(int i=colmax;i>=colmin;i--){
                if(tree[rowmax][i]<tree[rowmax+1][i])
                {
                    count++;
                }
            }
            }
            rowmax--;
            if(colmin<=colmax){
                for(int i=rowmax;i>=rowmin;i--){
                    if(tree[i][colmax]<tree[i][colmin-1]){
                        count++;
                    }
                }
            }
            colmin++;
        }
        System.out.println(count+outer);
    }
}
