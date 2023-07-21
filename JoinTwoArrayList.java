import java.util.*;
public class JoinTwoArrayList {
    public ArrayList<Integer> grouping(ArrayList list1,ArrayList list2){
        list1.addAll(list2);
        return list1;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter the Values of first List:");
        for(int i=0;i<4;i++){
            int num=s.nextInt();
            list1.add(num);
        }
        System.out.println("Enter the Values of Second List:");
        for(int i=0;i<3;i++){
            int num=s.nextInt();
            list2.add(num);
        }
        JoinTwoArrayList join = new JoinTwoArrayList();
        System.out.println(join.grouping(list1, list2));
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
    }
}
