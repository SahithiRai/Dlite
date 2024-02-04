public class NoTeenSum {
    public static void main(String[] args) {
        int result1 = noTeenSum(1, 2, 3);
        int result2 = noTeenSum(2, 13, 1);
        int result3 = noTeenSum(2, 1, 14);
        System.out.println(result1); 
        System.out.println(result2); 
        System.out.println(result3);
    }
    static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
    static int fixTeen(int n) {
        if ((n >= 13 && n <= 14) || (n >= 17 && n <= 19)) {
            return 0;
        }
        return n;
    }
}
