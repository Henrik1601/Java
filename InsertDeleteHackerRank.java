import java.io.*;
import java.util.*;

public class InsertDeleteHackerRank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int size = s.nextInt();
        for(int i=0;i<size;i++){
            int data=s.nextInt();
            list.add(data);
        }
        int choice=s.nextInt();
        for(int i=0;i<choice;i++){
            String str = s.next();
            if(str.equals("Insert")){
                int index=s.nextInt();
                int val=s.nextInt();
                list.add(index,val);
            }
            else{
                int index=s.nextInt();
                list.remove(index);
            }
        }
        System.out.println(list);
    }
}