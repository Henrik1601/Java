import java.util.*;
public class PHYSICS {
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        char []arr=str.toCharArray();
        int size=arr.length,i,j,mid=size/2;
        char [][]temp=new char[size][size];
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                temp[i][j]=' ';
            }
        }
        for(i=0;i<size;i++)
        {
            temp[i][mid]=arr[i];
        }
        for(i=0;i<size;i++)
        {
            temp[mid][i]=arr[i];
        }
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                System.out.printf("%c",temp[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
