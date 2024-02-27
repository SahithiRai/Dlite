package nearestPrime;
import java.util.Scanner;
public class nearestPrime
{
	static int lowerPrime,UpperPrime;
	public static boolean isPrime(int num)
	{
        if(num<=1)
            return false;
        if(num<=3)
            return true;
        if(num==4)
        	return false;
        if(num%2==0||num%3==0)
            return false;
        for(int i=5;i*i<=num;i=i+6)
            if(num%i==0||num%(i+2)==0)
                return false;
        return true;
    }
	public static void NearestPrime(int X)
	{
        lowerPrime=X-1;
        UpperPrime=X+1;
        while(true)
        {
            if(isPrime(lowerPrime))
                break;
            else if(isPrime(UpperPrime))
                break;
            lowerPrime--;
            UpperPrime++;
        }
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.print("Enter x: ");
		x=sc.nextInt();
		NearestPrime(x);
		System.out.println("Nearest prime to " +x+" : "+lowerPrime+" "+UpperPrime);
		sc.close();
	}
}
