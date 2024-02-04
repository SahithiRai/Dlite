package Dlite;

import java.util.Scanner;
public class stringtimes
{
	static int n;
	static String s;
	public static String stringTimes()
	{
		String result="";
		for(int i=0;i<n;i++)
			result+=s;
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		s=sc.next();
		System.out.print("Enter a number: ");
		n=sc.nextInt();
		System.out.println(stringTimes());
		sc.close();
	}
}