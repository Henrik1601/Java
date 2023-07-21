public class LinkedListProb {
    class LinkedList{
        int data;
        LinkedList next;
        LinkedList(int data){
            this.data = data;
            next = null;
        }
    }
    LinkedList head = null, temp = null;
    public void insertingNode(int data){
        LinkedList newNode = new LinkedList(data);
        head = insert(newNode,data);
    }
    LinkedList insert(LinkedList newNode, int data){
        if(head == null){
            head = newNode;
            temp = newNode;
        }
        else{
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }
    public void SwiftPrint(LinkedList head, int noOfSwift){
        LinkedList root = head;
        LinkedList tail = null;
        while(noOfSwift != 0){
            while(root != null){

            }
        }
    }
    public static void main(String args[]){
        LinkedListProb object = new LinkedListProb();
        for(int i =0;i<5;i++){
            int data = i+1;
            object.insertingNode(data);
        }
        object.temp.next = object.head;
        int noofSwift = 3;
        LinkedList traverse = object.head;
        do{
            System.out.print(object.traverse.data+" ");
            object.traverse = object.traverse.next; 
        }while()
        object.SwiftPrint(object.head, noOfSwift);
    }
}
