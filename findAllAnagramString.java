import java.util.*;
public class findAllAnagramString {
    public List<Integer> findAnagrams(String s, String p) {
        int end=s.length();
        int start=0;
        char sArr[]=s.toCharArray();
        ArrayList <Integer> list = new ArrayList<>();
        while(end<s.length()){
            String str="";
            for(int i=start;i<end;i++){
                str+=sArr[i];
            }
            boolean valid=true;;
            for(char c: p.toCharArray()){
                if(!str.contains(c)){
                    valid=false;
                }
            }
            if(valid==true){
               list.add(start);
            }
            start++;
            end++;
        }
        return list;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        findAllAnagramString find = new findAllAnagramString();
        ArrayList <List<Integer>> list = new ArrayList<>();
        list.add(find.findAnagrams(s, p));
    }
}
