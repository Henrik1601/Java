import java.util.*;
public class Priorqueue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        PriorityQueue <String> queue = new PriorityQueue<>();
        for(int i = 0;i < 5; i++){
            String data = sc.nextLine();
            queue.add(data);
        }
        Iterator it = queue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        PriorityQueue <String> queue2 = new PriorityQueue<>();
        queue2.addAll(queue);
        if(queue2.equals(queue)){
            System.out.println(queue2.equals(queue));
        }
        else{
            System.out.println(!queue2.equals(queue));
        }
    }
}
