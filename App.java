import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Exercise 1 Counter Tally
        /*
         * Counter tally = new Counter();
         * tally.click();
         * tally.click();
         * int result = tally.getValue();
         * 
         * tally.undo();
         * 
         * result = tally.getValue();
         * System.out.println(result);
         */
        // tallyCounter.undo();

        // Exercise 2 Super
        // Truck truck = new Truck();
        Truck truck2 = new Truck(0, null); // Still calls default constructor

        // Exercise 3 BMI and Switch Case
        float height = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hello, would you like to a view a profile, or add a new profile");
            System.out.println("1. View a profile, 2. Create a new Profile");

            if (scanner.hasNextFloat()) {
                int choice = scanner.nextInt();
            } else {
                System.out.println("Please input a valid number");
                scanner.next();
            }

            // System.out.println("Please enter your ");
        }

    }

}
