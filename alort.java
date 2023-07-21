
import java.util.*;
 
class alort {
    public void minCost(int costs[][], int N)
    {
        if (N == 0)
            return;
        else{
        int previous_red = costs[0][0];
        int previous_blue = costs[0][1];
        int previous_green = costs[0][2];
        int current_red;
        int current_blue;
        int current_green;
        for (int i = 1; i < N; i++) {
            current_red
                = Math.min(previous_blue, previous_green)
                  + costs[i][0];
            current_blue
                = Math.min(previous_red, previous_green)
                  + costs[i][1];
            current_green
                = Math.min(previous_red, previous_blue)
                  + costs[i][2];
            previous_red = current_red;
            previous_blue = current_blue;
            previous_green = current_green;
        }
        System.out.println(
            Math.min(previous_red,
                     Math.min(previous_blue,previous_green)));
        }
    }
    public static void main(String[] args)
    {
        int costs[][] = { { 14, 2, 11 },
                          { 11, 14, 5 },
                          { 14, 3, 10 } };
        
        alort obj = new alort();
        int N = costs.length;
        obj.minCost(costs, N);
    }
}