import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = checkPrimeAndDigitSumPrime(num);
        System.out.println("Output: " + result);
    }

    public static int checkPrimeAndDigitSumPrime(int num) {
        if (!isPrime(num)) {
            return 0;
        }
        int sumOfDigits = sumDigits(num);
        if (isPrime(sumOfDigits)) {
            return 1;
        }

        return 0;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
