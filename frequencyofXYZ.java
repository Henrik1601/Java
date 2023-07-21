import java.util.*;
public class frequencyofXYZ {
   public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    String str=s.next();
    int x_count=0,y_count=0,z_count=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='x'){
           x_count++;
        }
        else if(str.charAt(i)=='y'){
            y_count++;
        }
        else{
            z_count++;
        }
    }
    if(x_count-1==y_count && x_count-1==z_count || y_count-1==x_count&&y_count-1==z_count || z_count-1==x_count&&z_count-1==y_count){
        System.out.println("Yes");
    }
    else if(x_count==1){
        if(y_count==z_count){
            System.out.println("Yes");
        }
    }
    else if(y_count==1){
        if(x_count==z_count){
            System.out.println("Yes");
        }
    }
    else if(z_count==1){
        if(x_count==y_count){
            System.out.println("Yes");
        }
    }
    else{
        System.out.println("No");
    }
   } 
}
