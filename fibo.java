import java.util.*;
public class fibo {
    
    public static void main(String args[]){
      Scanner s  = new Scanner(System.in);
      int num=s.nextInt();
      int traversal=0,start=0,end=1;
      while(traversal<=num){
          traversal=start+end;
          System.out.printf("%d ",traversal);
          
      }
    }

}
