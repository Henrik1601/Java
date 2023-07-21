import java.util.Arrays;

public class wordBreak {

    public boolean contains(String word, StringBuilder str){
        String temp = str.toString();
        if(temp.contains(word)){
            return true;
        }

        return false;
    }
    
    public static void main(String args[]){
        wordBreak br = new wordBreak();
        
        String str = "catsandog";
        String strArr[] = {"cats","dog","sand","and","cat"};
        StringBuilder sc = new StringBuilder(str);
        for(int i = 0 ; i < strArr.length; i++){
            if(br.contains(strArr[i],sc)){
                while(br.contains(strArr[i],sc)){
                    int index = sc.indexOf(strArr[i]);
                    sc.replace(index, index+strArr[i].length(), "");
                }
                strArr[i] = "0";
            }
        }
        System.out.println(sc.toString()+" "+Arrays.toString(strArr));
    }
}
