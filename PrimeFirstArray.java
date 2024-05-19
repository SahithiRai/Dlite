import java.util.Scanner;

public class PrimeFirstArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the size of the array
        System.out.print("Enter the size of the array (n): ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] result = new int[n];

        // Reading the array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Index pointers for result array
        int primeIndex = 0;
        int nonPrimeIndex = n - 1;

        // Placing primes at the beginning and non-primes at the end
        for (int num : arr) {
            if (isPrime(num)) {
                result[primeIndex++] = num;
            } else {
                result[nonPrimeIndex--] = num;
            }
        }

        // Adjusting the final order of non-prime elements
        for (int i = nonPrimeIndex + 1, j = n - 1; i < j; i++, j--) {
            int temp = result[i];
            result[i] = result[j];
            result[j] = temp;
        }

        // Printing the modified array
        System.out.println("Modified array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
