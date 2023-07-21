import java.util.*;
public class NightClass1Ex2 {
    public static void main(String args[]){
        Stack<Integer> actual = new Stack<>();
        Stack<Integer> aux = new Stack<>();
        Scanner s= new Scanner(System.in);
        int size = s.nextInt();
        while(size!=0){
            int data = s.nextInt();
            actual.push(data);
            while(!actual.isEmpty()){
                aux.push(actual.peek());
                actual.pop();
            }
            size--;
        }
        System.out.println(aux);
    }
}
