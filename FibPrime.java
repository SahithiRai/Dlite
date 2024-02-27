package fib_Prime;
import java.util.Scanner;
public class FibPrime
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
    public static void fibPrime(int X)
    {
        if(isFibonacci(X))
        {
            if(isPrime(X))
                System.out.println(X);
            else
            {
                int lowerFib=X-1,upperFib=X+1;
                while(true)
                {
                    if(isFibonacci(lowerFib)&&isPrime(lowerFib))
                    {
                        System.out.println(lowerFib);
                        break;
                    }
                    else if(isFibonacci(upperFib)&&isPrime(upperFib))
                    {
                        System.out.println(upperFib);
                        break;
                    }
                    lowerFib--;
                    upperFib++;
                }
            }
        }
        else
        {
            int prev=0,next=1,fib;
            while(true)
            {
                fib=prev+next;
                prev=next;
                next=fib;
                if(fib>=X)
                    break;
            }
            if(isPrime(fib))
                System.out.println(fib);
            else
            {
                int lowerFib=fib-1,upperFib=fib+1;
                while(true)
                {
                    if(isFibonacci(lowerFib)&&isPrime(lowerFib))
                    {
                        System.out.println(lowerFib);
                        break;
                    }
                    else if(isFibonacci(upperFib)&&isPrime(upperFib))
                    {
                        System.out.println(upperFib);
                        break;
                    }
                    lowerFib--;
                    upperFib++;
                }
            }
        }
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.print("Enter x: ");
		x=sc.nextInt();
		fibPrime(x);
		sc.close();
	}
}
