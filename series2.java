package series;
import java.util.Scanner;
public class series2
{
	static int a,b,n;
	private static void printSeries()
	{
		int sum = a;
		for(int i=0;i<n;i++)
		{
			sum+=Math.pow(2,i)*b;
			System.out.print(sum+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter q: ");
		int q = sc.nextInt();
		for(int i=0;i<q;i++)
		{
			System.out.print("Enter a,b,n: ");
			a=sc.nextInt();
			b=sc.nextInt();
			n=sc.nextInt();
			printSeries();
			System.out.print("Enter a,b,n: ");
			a=sc.nextInt();
			b=sc.nextInt();
			n=sc.nextInt();
			printSeries();
		}
		sc.close();
	}
}
