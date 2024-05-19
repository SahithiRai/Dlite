import java.util.Scanner;

public class MostRepeatedElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Reading the array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Finding and printing the most repeated elements
        printMostRepeatedElements(arr);
    }

    public static void printMostRepeatedElements(int[] arr) {
        int n = arr.length;
        int maxFrequency = 1;
        boolean[] visited = new boolean[n];

        // Initialize the visited array
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }

        // Determine the frequency of each element
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > maxFrequency) {
                maxFrequency = count;
            }
        }

        // Print elements with the maximum frequency
        System.out.print("Most repeated element(s): ");
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == maxFrequency) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
