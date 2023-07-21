import java.util.*;

public class genericClass {
    public static void main(String args[]) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        integerBox.add(1);
        integerBox.add(2);
        integerBox.add(3);

        stringBox.add("Me");
        stringBox.add("You");
        stringBox.add("Us");

        
        System.out.println(stringBox.get(0));

        int []arr={1,2,3,4,5};

        integerBox.add(arr[0]);

        for(int i=0;i<arr.length;i++){
            integerBox.add(arr[i]);
            integerBox.addAll();
        }
        
    }
}

class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get(int n) {
        
        return t;
    }

    public void addAll(){
        System.out.println(t);
    }
}
