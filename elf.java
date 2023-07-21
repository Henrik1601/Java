import java.util.*;
import java.io.*;
public class elf {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int count=0,max=0,index=0,out=0;
        for(int i=0;i<14;i++){
            out=s.nextInt();
            if(out!='\0'){
               count+=out;
            }
            else{
              index++;
              max=Math.max(count,max);
              count=0;
            }
        }
        System.out.println("Amount "+max+" Elf "+index);
    }
}
