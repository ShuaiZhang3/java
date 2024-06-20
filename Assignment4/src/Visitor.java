import java.util.Scanner;

public class Visitor extends User {

    public Visitor(String username, String password) {
        super(username, password, "Visitor");
    }

    @Override
    public void displayMenu(TodoManager todoManager, Scanner scanner) {
        int choice;
        do {
            System.out.println("\nVisitor Menu:");
            System.out.println("1. View Assigned Tasks");
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewAssignedTasks(todoManager, scanner);
                    break;
                case 0:
                    System.out.println("Logging out");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }

    private void viewAssignedTasks(TodoManager todoManager, Scanner scanner) {
        todoManager.viewAssignedTasks(scanner, this.username);
    }
}

