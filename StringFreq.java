import java.util.*;
public class StringFreq {
    public String decodeString(String s) {
        Stack <Character> stack = new Stack<>();
        int openIndex=0;
        int count=0;
        int openIndexCount=0;
        for(char c : s.toCharArray()){
            if(c!=']'){
                stack.push(c);
                if(c=='['){
                   openIndex = count-1;
                }
            }
            else{
                String temp="";
                while(stack.peek()!='['){
                    temp=stack.pop()+temp;
                }
                stack.pop();
                stack.pop();
                int freq = s.charAt(openIndex)-'0';
                temp=temp.repeat(freq);
                for(char d : temp.toCharArray()){
                    stack.push(d);
                }
                if(count%2==0){
                    openIndex=(count-1)/openIndex-1;
                }
            }
            count++;
        }
        String ans="";
        System.out.println(stack.size());
        while(!stack.isEmpty()){
            ans=stack.pop()+ans;
        }        
        return ans;
    }
    
    public static void main(String args[]){
       StringFreq sf = new StringFreq();
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       System.out.println(sf.decodeString(str));
    }
}
