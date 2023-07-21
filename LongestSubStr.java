import java.util.Stack;

public class LongestSubStr {
    
    public static void main(String args[]){
        String str = "abcabcbb";
        int max = Integer.MIN_VALUE;
        Stack<Character> stack =  new Stack<>();
        for(char c : str.toCharArray()){
            if(!stack.contains(c)){
                stack.push(c);
            }
            else{
                if(max < stack.size()){
                    max = stack.size();
                }
                stack.clear();
                stack.push(c);
            }
        }
        System.out.println(max);
    }
}
