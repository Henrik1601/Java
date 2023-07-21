import java.util.*;
public class TreeSet{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Set <String> set = new HashSet <>();
        for(int i=0;i<5;i++){
            String data = sc.nextLine();
            set.add(data);
        }
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Set <String> set2 = new HashSet<>();
        set2.addAll(set);
        System.out.println(set2);
    }
}