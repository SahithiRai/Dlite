import java.util.Scanner;

public class pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String pass = sc.nextLine();
        if (rules(pass)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

    static boolean rules(String pass) {
        if (pass.length() < 8) {
            return false;
        }
        if (pass.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialCharacter = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter;
    }
}
