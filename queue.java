import java.util.*;

public class queue {
    public static void main(String args[]){
        Queue <String> q = new LinkedList<>();
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.add("E");
        System.out.println(q.remove());
        System.out.println(q.poll());
        Iterator it = q.iterator();
        while(it.hasNext()){
            System.out.println("Element presented in queue: "+it.next());
        }

        Deque <String> queue = new ArrayDeque<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
