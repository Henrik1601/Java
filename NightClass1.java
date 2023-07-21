import java.util.*;
public class NightClass1 {
    public void multiplication(int []constant,int []imagine){
        int cons=(constant[0]*imagine[0])+(~(constant[1]*imagine[1]-1));
        int imag=(constant[0]*imagine[1])+(constant[1]*imagine[0]);
        System.out.printf("%d+%di\n",cons,imag);
    }
    public void subtract(int []constant,int []imagine){
        System.out.printf("%d+%di\n",constant[0]-imagine[0],constant[1]-imagine[1]);
    }
    public void addition(int[] constant,int[] imagine){
       System.out.printf("%d+%di\n",constant[0]+imagine[0],constant[1]+imagine[1]);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int constant[] = new int[2];
        int imagine[] = new int[2];
        for(int i=0;i<constant.length;i++){
            constant[i]=s.nextInt();
        }
        for(int i=0;i<imagine.length;i++){
            imagine[i]=s.nextInt();
        }
        NightClass1 obj = new NightClass1();
        obj.addition(constant,imagine);
        obj.subtract(constant,imagine);
        obj.multiplication(constant,imagine);
    }
}
