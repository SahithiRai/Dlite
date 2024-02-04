package Dlite;

import java.util.Scanner;
public class sumprime
{
	static int n1,n2;
	public static boolean SumPrime()
	{
		if(isPrime(n1)&&isPrime(n2))
			return isPrime(n1+n2);
		return false;
	}
	public static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++)
			if(num%i==0)
				return false;
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println(SumPrime());
		sc.close();
	}
}
