import java.util.*;
class Quadrilateral{
    public double areaoftarp(int x,int y,int h){
         return (0.5*(x+y)*h);
    }
    public double areaofparallel(int x,int y){
        return x*y;
    }
    public double areaofrect(int x,int y){
        return x*y;
    }
    public double areaofsq(int x){
        return x*x;
    }
}
public class NightClass3Ex2 extends Quadrilateral{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int h=s.nextInt();
        NightClass3Ex2 obj = new NightClass3Ex2();
        System.out.printf("Area of Parallelogram: %.2f\n",obj.areaofparallel(x, y));
        System.out.printf("Area of Rectangle: %.2f\n",obj.areaofrect(x, y));
        System.out.printf("Area of Square: %.2f\n",obj.areaofsq(x));
        System.out.printf("Area of Trapezoid: %.2f\n",obj.areaoftarp(x, y,h));

    }
}
