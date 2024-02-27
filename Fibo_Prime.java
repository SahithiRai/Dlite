import java.util.Scanner;
public class Fibo_Prime
{
	public static boolean isPerfectSquare(int x)
	{
        int s=(int)Math.sqrt(x);
        return s*s==x;
    }
    public static boolean isFibonacci(int n)
    {
        return isPerfectSquare(5*n*n+4)||isPerfectSquare(5*n*n-4);
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        if(n<=3)
            return true;
        if(n%2==0||n%3==0)
            return false;
        for(int i=5;i*i<=n;i=i+6)
            if(n%i==0||n%(i+2)==0)
                return false;
        return true;
    }
    public static void FibPrime(int X,int Y)
    {
        boolean found=false;
        for(int i=X;i<=Y;i++)
            if (isFibonacci(i)&&isPrime(i))
            {
                System.out.print(i+ " ");
                found=true;
            }
        if(!found)
            System.out.println("0");
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.print("Enter x & y: ");
		x=sc.nextInt();
		y=sc.nextInt();
		FibPrime(x,y);
		sc.close();
	}
}
