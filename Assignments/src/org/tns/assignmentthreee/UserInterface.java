package org.tns.assignmentthreee;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Products newprod = new Products();

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Menu:\n1) Add\n2) Display\n3) Exit");
            System.out.println("Enter your Choice: ");
            int choice = s.nextInt();
            s.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    System.out.println("Add the product details: ");
                    String prodname = s.nextLine();
                    newprod.addProductToList(prodname);
                    break;

                case 2:
                    System.out.println("Here are the products: ");
                    newprod.sortProductList();
                    break;

                case 3:
                    System.out.println("Thank You for using the application");
                    isRunning = false;  // Set isRunning to false to exit the loop
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
