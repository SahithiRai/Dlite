package Dlite;

import java.util.Scanner;

class Main {
    static boolean lastDigit(int x,int y) {
        return (x%10==y%10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X:");
        int x = sc.nextInt();
        System.out.println("Enter the y:");
        int y = sc.nextInt();
        System.out.println(lastDigit(x,y));
        sc.close();
    }
}
