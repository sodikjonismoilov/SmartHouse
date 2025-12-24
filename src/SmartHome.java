import java.util.Scanner;

public class SmartHome {


    public static void main(String[] args) {
        Device light = new Device("Light");
        Device fan = new Device("Fan");


        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1) Toggle light");
            System.out.println("2) Toggle fan");
            System.out.println("3) Show Status");
            System.out.println("0) Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    light.toggle();
                    System.out.println("Light toggled.");
                    break;
                case 2:
                    fan.toggle();
                    System.out.println("Fan toggled.");
                    break;
                case 3:
                    System.out.println(light.status());
                    System.out.println(fan.status());
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }

        } while (choice != 0 );
        scanner.close();
    }
}
