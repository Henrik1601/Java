public class paloAlto1 {

    public boolean fairIndex(int first[], int start){
        int firstSubSum = 0; int secondSubSum = 0;
        for(int i=0;i<first.length;i++){
            if(i<=start){
               firstSubSum += first[i];
            }
            else{
                secondSubSum += first[i];
            }
        }
        if(firstSubSum == secondSubSum) return true;
        return false;
    }
    
    public static void main(String args[]){
        int first[] = {4, -1, 0, 3};
        int second[] = {-2, 5, 0, 3};
        paloAlto1 palo = new paloAlto1();
        int fairIndex = 0;
        for(int i=0;i<first.length-1;i++){
            int start = i; 
            if(palo.fairIndex(first,start) && palo.fairIndex(second, start)){
               fairIndex++;
            }
        }
        System.out.print(fairIndex);
    }
}
