package Dlite;

package ZeroConverter;
import java.util.Scanner;
public class ZeroConverter
{
	static int i,n;
	public static void neg()
	{
		for (i=n;i<=0;i++)
			System.out.print(i+" ");
		System.out.println();
	}
	public static void pos()
	{
		for (i=n-1;i>=0;i--)
			System.out.print(i+" ");
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==0)
			System.out.println("already Zero");
		else if(n>0)
			pos();
		else
			neg();
		sc.close();
	}
}