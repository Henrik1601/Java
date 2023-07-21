public class BeforeSmallerAfterLarger {
    public boolean beforeSmaller(int arr[], int index){
        for(int i=0;i<index;i++){
            if(arr[index]<arr[i]){
                return false;
            }
        }
        return true;
    }

    public boolean afterLarger(int arr[],int index){
        for(int i=index+1;i<arr.length;i++){
            if(arr[index]>arr[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        int arr[] = {5,1,4,3,6,8,10,7,9};
        BeforeSmallerAfterLarger ab = new BeforeSmallerAfterLarger();
        for(int i=1;i<arr.length-1;i++){
            if(ab.beforeSmaller(arr,i) && ab.afterLarger(arr,i)){
                System.out.print("The index of "+i+" has the value of "+arr[i]+" Satisfied the property");
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
