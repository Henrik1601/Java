class Area{
    public void area(int length,int breadth){
        System.out.println("Area of Rectangle: "+(length*breadth));
    }
}
class AreaSq extends Area{
    public void areaSq(int length){
        System.out.println("Area of Rectangle: "+(length*length));
    }
}
public class AreaOfRect extends Area {
    public static void main(String args[]){
        AreaSq obj = new AreaSq();
        obj.area(10,5);
        obj.areaSq(10);
    }
}
