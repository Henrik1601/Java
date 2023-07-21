import java.util.*;
public class backSpaceString {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c!='#'){
                stack.push(c);
            }
            else{
                stack.pop();
            }
        }
        String newS="";
        while(!stack.isEmpty()){
            char c = stack.pop();
            newS = c + newS;
        }
        for(char c : t.toCharArray()){
            if(c!='#'){
                stack.push(c);
            }
            else{
                stack.pop();
            }
        }
        String newT="";
        while(!stack.isEmpty()){
            char c = stack.pop();
            newT = c + newT;
        }
        if(newS.equals(newT)) return true;
        return false;
    }
    
    public static void main(String args[]){
        backSpaceString delete = new backSpaceString();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(delete.backspaceCompare(s, t));
    }
}
