import java.util.*;
public class oddevenArray {
    
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int f[]=new int[5];
        int sec[]=new int[5];
        int ans[]=new int[5];
        int index=0;
        for(int i=0;i<f.length;i++){
            f[i]=s.nextInt();
        }
        for(int i=0;i<sec.length;i++){
            sec[i]=s.nextInt();
        }
        int midpoint=5/2;
        for(int i=0;i<f.length;i++){
            if(i==midpoint){
               ans[index++]=f[i]*sec[i];
            }
            else
            {
                ans[index++]=f[i]*sec[i+1];
                ans[index++]=f[i+1]*sec[i];
                i++;
            }
        }
        for(int i=0;i<index;i++){
            System.out.printf("%d ",ans[i]);
        }
        System.out.println();
        int newin=0;
        for(int i=0;i<index;i++){
            int num=ans[i];
            while(num!=0){
                newin++;
                num=num/10;
            }
            if(newin==1){
                System.out.printf("S ");
            }else{
                System.out.printf("D ");
            }
            newin=0;
        }
        System.out.println();
        int rem[]=new int[5]; int newindex=0;
        for(int i=0;i<index;i++){
            rem[newindex++]=sec[i]%f[i];
        }
        for(int i=0;i<newindex;i++){
            System.out.printf("%d ",rem[i]);
        }System.out.println();
        for(int i=0;i<newindex;i++){
           if(rem[i]%2==0){
            System.out.printf("E ");
           }else{
            System.out.printf("O ");
           }
        }
    }
}
