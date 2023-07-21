import java.util.*;

public class ArrayListSwap {
    public List<String> swappingTwoValues(List<String> list){
        Scanner s= new Scanner(System.in);
         
        System.out.print("Enter the value: ");
        String val=s.nextLine();
        System.out.print("Enter the value which will going to swap with value 1");
        String swap = s.nextLine();
        if(list.contains(val) && list.contains(swap)){
           int index1=list.indexOf(swap);
           int index2=list.indexOf(val);
           list.set(index1,val);
           list.set(index2,swap);
        }

        return list;
    }
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        Scanner s= new Scanner(System.in);
        for(int i=0;i<5;i++){
            String str = s.nextLine();
            list.add(str);
        }
        ArrayListSwap as = new ArrayListSwap();
        System.out.println(as.swappingTwoValues(list));
    }
}
