import java.util.*;
public class stackAssesment {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        Stack<Character> stack = new Stack<>();
        int num=0;
        for(char c : str.toCharArray()){
            if(c=='('||c=='{'||c=='['||c=='<'){
                stack.push(c);
            }
            else if(c=='}' && !stack.isEmpty()&& stack.peek()=='{'){
                stack.pop();
            }
            else if(c==')' && !stack.isEmpty()&& stack.peek()=='('){
                stack.pop();
            }
            else if(c==']' && !stack.isEmpty()&& stack.peek()=='['){
                stack.pop();
            }
            else{
                if(stack.peek()==''){
                    num=num+3;
                }
                else if(stack.peek()==']')
                {
                    num=num+57;
                }else if(stack.peek()=='}')
                {
                    num=num+1197;
                }
                else if(stack.peek()==')')
                {
                    num=num+25137;
                }
            }
        }
        System.out.println(num);
    }
}
