package primeDigitSum;
import java.util.Scanner;
public class primeDigitSum
{
	public static boolean isPrime(int num)
	{
        if(num<=1)
            return false;
        if(num<=3)
            return true;
        if(num%2==0||num%3==0)
            return false;
        for(int i=5;i*i<=num;i=i+6)
            if(num%i==0||num%(i+2)==0)
                return false;
        return true;
    }
    public static boolean PrimeDigitSum(int X)
    {
        int sum=0;
        while(X>0)
        {
            int digit=X%10;
            if(digit==2||digit==3||digit==5||digit==7)
                sum+=digit;
            X/=10;
        }
        return isPrime(sum);
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.print("Enter x: ");
		x=sc.nextInt();
		System.out.println(PrimeDigitSum(x));
		sc.close();
	}
}
