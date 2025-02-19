import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            //Display menu
            System.out.println("\n🛒 Shopping Menu:");
            System.out.println("1. Add item to cart");
            System.out.println("2. Checkout");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            //Handle choices

            if (choice == 1) {
                System.out.println("Item added to cart");
            } else if (choice == 2) {
                System.out.println("Checking out... Thank you for shopping!");
            } else if (choice == 3) {
                System.out.println(" Good bye!");
            } else {
                System.out.println("Invalid choice. Try again");
            }
            } while (choice !=2 && choice !=3); //Keep showing menu until user checks out or exit
                scanner.close();
}
}


