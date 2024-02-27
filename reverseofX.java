package reverseofX;
import java.util.Scanner;
public class reverseofX
{
	static int x;
	public static void ReverseOfX()
	{
		int rev=0,X=x;
        while(X!=0)
        {
            int dgit=X%10;
            rev=rev*10+dgit;
            X/=10;
        }
        System.out.println("Reverse of "+x+" is: "+rev);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x: ");
		x=sc.nextInt();
		ReverseOfX();
		sc.close();
	}
}
