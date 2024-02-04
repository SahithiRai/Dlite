package Dlite;

import java.util.Scanner;

class Main {
    static boolean isEven(int n) {
        return (n % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n = sc.nextInt();
        System.out.println(isEven(n));
        sc.close();
    }
}
