import java.util.Scanner;

class Customer {
    private String name;
    private String city;
    private int id;
    public Customer() {
        this.name = "sahithi";
        this.city = "mangalore";
        this.id = 1;
    }

    public Customer(String name, String city, int id) {
        this.name = name;
        this.city = city;
        this.id = id;
    }
    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer City: " + city);
    }
}

public class CustomerData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer city: ");
        String city = scanner.nextLine();
        Customer defaultCustomer = new Customer();
        System.out.println("\nCustomer details using default constructor:");
        defaultCustomer.displayCustomerDetails();
        Customer parameterizedCustomer = new Customer(name, city, id);
        System.out.println("\nCustomer details using parameterized constructor:");
        parameterizedCustomer.displayCustomerDetails();
    }
}
