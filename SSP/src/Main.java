import registerServices.RegisterService;
import registerServices.implementation.EmployeeSign;
import registerServices.implementation.CustomerSign;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Sir!");
        System.out.print("What is ur id?   ");
        Long id = scanner.nextLong();
        System.out.print("What is ur name? (for signing)->   ");
        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();
        System.out.print("Select:  (1. Customer) (2. Employee):   ");
        long chose = scanner.nextLong();
        RegisterService service;
        Scanner sc = new Scanner(System.in);
        if (chose == 1) {
            service = new CustomerSign();
            System.out.println("Enter the ur Problem");
            String text = sc.nextLine();
            service.sign(id, name, text);
        } else if (chose == 2) {
            service = new EmployeeSign();
            System.out.println("Enter the ur Role");
            String text = sc.nextLine();
            service.sign(id, name, text);
        }
        System.out.println("Thank you for using our service!");

    }
}
