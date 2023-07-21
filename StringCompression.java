import java.util.*;
public class StringCompression {
    public void compress(String s){
        Stack <Character> stack = new Stack <>();
        int sum = 0;
        stack.push(s.charAt(0));
        for(char c : s.toCharArray()){
            if(stack.isEmpty() || c != stack.peek()){
                stack.push((char)(sum+'0'));
                sum=0;
                stack.push(c);
            }
            if(c == stack.peek()){
                sum++;
            }
        }
        stack.push((char)(sum+'0'));
        System.out.println(stack.size());
    }
    public static void main(String args[]){
        String s = "aabbccc";
        StringCompression sc = new StringCompression();
        sc.compress(s);
    }
}
