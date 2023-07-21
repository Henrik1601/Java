import java.util.*;

public class Queue2Stack1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Queue <Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int choice = sc.nextInt();
            if(choice == 1){
                int data = sc.nextInt();
                q.add(data);
            }
            else{
                if(q.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(q.poll());
                } //1 2 2 2 1 4
            }
        }
    }
}
