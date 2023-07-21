public class GreatestTwoDigitsNum {
    
    public static void main(String args[]){
        int num = 5870157;
        String str = Integer.toString(num);
        int first=0, second = 1;
        int max = Integer.MIN_VALUE;
        while(second<str.length()){
            String temp = Character.toString(str.charAt(first))+Character.toString(str.charAt(second));
            if(max < Integer.parseInt(temp)){
                max = Integer.parseInt(temp);
            }
            first = second;
            second++;
        }
        System.out.println(max);
    }
}
