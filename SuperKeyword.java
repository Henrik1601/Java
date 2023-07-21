class SuperAge{
    int age;
    SuperAge(int age){
        this.age=age;
    }
    public void display(){
        System.out.println("The Age is: "+age);
    }
}
public class SuperKeyword extends SuperAge {
    SuperKeyword(int age){
        super(age);
    }
    public static void main(String args[]){
       SuperKeyword obj = new SuperKeyword(10);
       obj.display();
    }
    
}
