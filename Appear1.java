public class Appear1 {
    
    public static void main(String args[]){
        int num = 13;
        int count = 0;
        for(int i = 0; i <=num; i++){
           int number = i;
           while(number != 0){
            if(number%10 == 1){
                count++;
            }
            number = number/10;
           }
        }
        System.out.print(count);
    }
}
