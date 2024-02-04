import java.util.Scanner;

class Main {
    static int sumDouble(int x,int y) {
        return (x==y)?2*(x+y):x+y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X:");
        int x = sc.nextInt();
        System.out.println("Enter the y:");
        int y = sc.nextInt();
        System.out.println(sumDouble(x,y));
        sc.close();
    }
}
