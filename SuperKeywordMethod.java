class SuperM{
    int num=20;
    public void display(){
        System.out.println("We are in Super Display");
    }
}
public class SuperKeywordMethod extends SuperM {
    int num=10;
    public void display(){
        System.out.println("We are in main Display Method");
    }
    public void method(){
        SuperKeywordMethod obj = new SuperKeywordMethod();
        obj.display();
        System.out.println("The value in main Display: "+obj.num);
        super.display();
        System.out.println("The value in super Display: "+super.num);
    }
    public static void main(String args[]){
        SuperKeywordMethod obj = new SuperKeywordMethod();
        obj.method();
    }
}
