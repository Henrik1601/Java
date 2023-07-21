import java.util.*;
public class singleDouble {
    public boolean verifyit(int  nums){
        int count=0;
        while(nums!=0){
            nums=nums/10;
            count++;
        }
        if(count==1) return true;

        return false;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int row=s.nextInt(); int col=s.nextInt();
        int rowmin=0,rowmax=row-1;
        int colmin=0,colmax=col-1;
        int mid=row/2;
        int  arr[][]=new int [row][col];
        singleDouble obj = new singleDouble();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=s.nextInt();
            }
        }
        while(rowmin<=rowmax && colmin<=colmax){
            for(int i=colmin;i<=colmax;i++){
               if(i%2!=0){
                  boolean sd = obj.verifyit(arr[rowmin][i-1]);
                  if(!sd){
                    System.out.printf("D ");
                  }else{
                    System.out.printf("S ");
                  }
               }
               else{
                System.out.printf("%d ",arr[rowmin][i]);
               }
            }
            rowmin++;
            for(int i=rowmin;i<=rowmax;i++){
                if(i%2!=0){
                    boolean sd = obj.verifyit(arr[i-1][colmax]);
                    if(!sd){
                        System.out.printf("D ");
                      }else{
                        System.out.printf("S ");
                      }
                 }
                 else{
                    System.out.printf("%d ",arr[i][colmax]);
                 }
            }
            colmax--;
            if(rowmin<=rowmax){
                for(int i=colmax;i>=colmin;i--){
                    if(i%2!=0){
                        boolean sd = obj.verifyit(arr[rowmax][i+1]);
                        if(!sd){
                            System.out.printf("D ");
                          }else{
                            System.out.printf("S ");
                          }
                     }
                     else{
                        System.out.printf("%d ",arr[rowmax][i]);
                     }
                }
            }
            rowmax--;
            if(colmin<=colmax){
                for(int i=rowmax;i>=rowmin;i--){
                    if(i%2!=0){
                        boolean sd = obj.verifyit(arr[i+1][colmin]);
                        if(!sd){
                            System.out.printf("D ");
                          }else{
                            System.out.printf("S ");
                          }
                     }
                     else{
                        System.out.printf("%d ",arr[i][colmin]);
                     }
                }
            }
            colmin++;
        }
    }
}
