package nearestArmstrong;
import java.util.Scanner;
public class nearestArmstrong
{
	public static int power(int base,int exponent)
	{
        int result=1;
        for(int i=0;i<exponent;i++)
            result*=base;
        return result;
    }
    public static int numDigits(int number)
    {
        int count=0;
        while(number!=0)
        {
            number/=10;
            count++;
        }
        return count;
    }
    public static boolean isArmstrong(int number)
    {
        int originalNumber=number,n=numDigits(number),sum=0;
        while(number!=0)
        {
            int digit=number%10;
            sum+=power(digit,n);
            number/=10;
        }
        return sum==originalNumber;
    }
    public static int NearestArmstrong(int X)
    {
        int lowerArmstrong=X-1,upperArmstrong=X+1;
        while(true)
        {
            if(isArmstrong(lowerArmstrong))
                return lowerArmstrong;
            else if(isArmstrong(upperArmstrong))
                return upperArmstrong;
            lowerArmstrong--;
            upperArmstrong++;
        }
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.print("Enter x: ");
		x=sc.nextInt();
		System.out.println(NearestArmstrong(x));
		sc.close();
	}
}
