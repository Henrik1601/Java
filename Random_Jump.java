import java.util.Random;

class Random_Jump{
    public static void main(String args[])
    {
        int max=0;
        int index=0;
        Random rand = new Random();
        do{
            System.out.println("position: "+index);
            Boolean val=rand.nextBoolean();
            if(val==true)
            {
                index--;
            }
            else{
                index++;
            }
            if(index>max){
                max=index;
            }

        }while(index!=3 && index!=-3);
        System.out.println("position: "+index);
        System.out.println("The Maximum position: "+max);
    }
}