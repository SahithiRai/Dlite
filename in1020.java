package Dlite;

import java.util.Scanner;

class Main {
    static boolean in1020(int x,int y) {
        return (x>=10 && x<=20)||(y>=10 && y<=20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X:");
        int x = sc.nextInt();
        System.out.println("Enter the y:");
        int y = sc.nextInt();
        System.out.println(in1020(x,y));
        sc.close();
    }
}