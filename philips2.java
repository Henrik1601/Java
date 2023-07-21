import java.util.*; //clock and anti-clockwise//
public class philips2 {
    public void clockwise(int [][]temp){
        int rowmin=0,rowmax=temp.length-1;
        int colmin=0, colmax=temp[0].length-1;
        int clock[][] = new int[temp.length][temp[0].length];
        System.out.println();
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[0].length;j++){
                System.out.printf("%d ",temp[i][j]);
            }
            System.out.println();
        }
        while(rowmin<=rowmax){
            int k=temp.length-1;
            for(int i=colmin;i<=colmax;i++){
                clock[rowmin][i]=temp[rowmin][k--];
            }
            rowmin++;
        }
        System.out.println();
        for(int i=0;i<clock.length;i++){
            for(int j=0;j<clock[0].length;j++){
               System.out.printf("%d ",clock[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        anticlockwise(clock);
    }
    public void anticlockwise(int [][]clock){
        int rowmin=0,rowmax=clock.length-1;
        int colmin=0,colmax=clock[0].length-1;
        int [][]anticlock = new int[clock.length][clock[0].length];
        int k =rowmax;
        while(rowmin<=rowmax){
            for(int i=colmin;i<=colmax;i++){
               anticlock[rowmin][i]=clock[k][i];
            }
            rowmin++;
            k--;
        }
        for(int i=0;i<anticlock.length;i++){
            for(int j=0;j<anticlock[0].length;j++){
                System.out.printf("%d ",anticlock[i][j]);
            }
            System.out.println();
        }
    }
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int row=s.nextInt();
    int col=s.nextInt();
    int [][]mat = new int[row][col];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            mat[i][j]=s.nextInt();
        }
    }
    int temp[][]=new int[row][col];
    int rowmin=0,rowmax=row-1;
    int colmin=0,colmax=col-1;
    int k=0,tempcol=colmin;
    while(rowmin<=rowmax){
        k=temp.length-1;
        for(int i=colmin;i<=colmax;i++){
            temp[rowmin][i]=mat[k--][tempcol];
        }
        rowmin++;
        tempcol++;
    }
    philips2 obj = new philips2();
    obj.clockwise(temp);
  }  
}
