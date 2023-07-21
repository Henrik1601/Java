import java.util.*;
public class checkWhetherTheTwolistAreEqual {
    boolean valid=false;
    public boolean EqualList(ArrayList list1,ArrayList list2){
        Scanner s = new Scanner(System.in);
        if(list1.size()==list2.size()){
            int count=0;
            for(int i=0;i<list1.size();i++){
                if(list1.get(i)!=list2.get(i)){
                    return false;
                }
                else{
                    count++;
                }
            }
            if(count==list1.size()){
                valid=true;
            }
        }
        else{
            if(list1.size()<list2.size()){
                System.out.println("Enter the value for list1 to make equal with list2");
                int num=s.nextInt();
                list1.add(num);
                EqualList(list1, list2);
            }
            else{
                System.out.println("Enter the value for list2 to make equal with list1");
                int num=s.nextInt();
                list2.add(num);
                EqualList(list1, list2);
            }
        }
        System.out.println(list1+" "+list2);
        return valid;
    }
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       ArrayList <Integer> list1 = new ArrayList<>();
       ArrayList <Integer> list2  = new ArrayList<>();
       for(int i=0;i<2;i++){
        int num=s.nextInt();
        list1.add(num);
       }
       for(int i=0;i<3;i++){
        int num=s.nextInt();
        list2.add(num);
       }
       checkWhetherTheTwolistAreEqual equal = new checkWhetherTheTwolistAreEqual();
       if(equal.EqualList(list1, list2)){
        System.out.println("True");
       }
       else{
        System.out.println("False");
       }
    }
}
