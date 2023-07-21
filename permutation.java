import java.util.*;
public class permutation {
	static int fact(int n)
  {
    int fact = 1;
    for (int i = 2; i <= n; i++)
        fact *= i;
    return fact;
  }
	static int ncr(int n, int r)
   {
    int ncr = fact(n) / (fact(r) * fact(n - r));
    return ncr;
   }
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int w=sc.nextInt();
		int n=sc.nextInt();
		int k=sc.nextInt();
		int ans=0;
		while (m >= k) 
		{
         ans += ncr(m, k) * ncr(w, n - k);
         k++;
        }
		System.out.print(ans);

		
	}
}
