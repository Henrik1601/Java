public class CloseToX {
    
    public static void main(String args[]){
        int arr[] = {10,22,28,29,30,40};
        int x = 54;
        int max = Integer.MIN_VALUE;
        int firstValue=0; int secondValue = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j <arr.length ; j++){
                if(max < arr[i]+arr[j] && arr[i]+arr[j]<=x){
                    max = arr[i]+arr[j];
                    firstValue = arr[i];
                    secondValue = arr[j];
                }
            }
        }
        System.out.println(firstValue+" "+secondValue);
    }
}
