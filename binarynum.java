package binarynum;
import java.util.Scanner;
public class binarynum
{
	static int x;
	public static void BinaryNum()
	{
		StringBuilder binStr = new StringBuilder();
        if(x==0)
            binStr.append("0");
        while(x>0)
        {
            int rem=x%2;
            binStr.insert(0,rem);
            x/=2;
        }
        System.out.println("Binary of "+x+" is: "+binStr);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x: ");
		x=sc.nextInt();
		BinaryNum();
		sc.close();
	}
}
