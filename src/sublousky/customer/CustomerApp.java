package sublousky.customer;

import java.util.Scanner;


public class CustomerApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Customer Viewer");
        System.out.println();

        // create 1 or more line items
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter a customer number: ");
            String customerNumber = sc.nextLine();

            // get the Customer object
            Customer customer = CustomerDB.getCustomer(customerNumber);

            // display the output
            if (customer.getName() == "Unknown"){
                System.out.println("\n" + "There is no customer number " + customer.getCustNum() + " in our records. \n");
            }
            else {
            System.out.println(customer.getNameAndAddress());
            }

            // see if the user wants to continue
            System.out.print("Display another customer? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }

        System.out.println("Bye!");
    }
}