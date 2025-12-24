import java.util.Scanner;

public class SmartHome {


    public static void main(String[] args){
        Device light = new Device("Light");
        Device fan = new Device("Fan");
        Device tv = new Device("TV");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1) Toggle light");
            System.out.println("2) Toggle fan");
            System.out.println("3) Toggle TV");
            System.out.println("4) Show Status");
            System.out.println("5) Turn off every device");
            System.out.println("0) Exit");


            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    light.toggle();
                    System.out.println("Light toggled, its ON.");
                    break;
                case 2:
                    fan.toggle();
                    System.out.println("Fan toggled, its ON.");
                    break;
                case 3:
                    tv.toggle();
                    System.out.println("TV toggled, its ON.");
                    break;
                case 4:
                    System.out.println(light.status());
                    System.out.println(fan.status());
                    System.out.println(tv.status());
                    break;
                case 5:
                    light.turnOff();
                    fan.turnOff();
                    System.out.println("Every device turned off.");
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
