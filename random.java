import java.util.*;
public class random {
   public static void main(String args[]){
    Scanner s =new Scanner(System.in);
    char clarify[]={'A','B','C'};
    char oppenent[]=new char[3];
    for(int i=0;i<oppenent.length;i++){
        oppenent[i]=s.next().charAt(0);
        HashMap <Character,Character> map1=new HashMap<>();
        if(oppenent[i]=='A'){
            map1.put('Y','X');
        }
        else if(oppenent[i]=='B'){
            map1.put('Z','Y');
        }
        else if(oppenent[i]=='C'){
            map1.put('X','Z');
        }
        char mymove[]={'X','Y','Z'};
        Random random = new Random();
        char mine = mymove[random.nextInt(mymove.length)];
    }
    
    for(int i=0;i<3;i++){
        
        System.out.println(mine);
    }
    
   } 
}
