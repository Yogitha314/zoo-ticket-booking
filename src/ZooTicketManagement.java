import java.util.Scanner;

public class ZooTicketManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket adult = new Ticket("Adult Ticket", 100, 500);
        int choice;
        do {
            System.out.println("\n1. View  2. Book  3. Cancel  4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(adult.getTicketName()
                        + " | Available: " + adult.getAvailable()
                        + " | Price: Rs." + adult.getPrice());
                    break;
                case 2:
                    System.out.print("Quantity: ");
                    System.out.println(adult.book(sc.nextInt()) ? "Booked!" : "Invalid quantity.");
                    break;
                case 3:
                    System.out.print("Cancel quantity: ");
                    System.out.println(adult.cancel(sc.nextInt()) ? "Cancelled!" : "Invalid quantity.");
                    break;
                case 4:
                    System.out.println("Thank you for visiting the zoo!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        sc.close();
    }
}