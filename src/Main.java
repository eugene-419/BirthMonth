import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int birthMonth = 0;
        String newLine = "";
        String trash = "";

        // Ask the user to enter their birth month
        // Check that the input is an integer
        // Check that the month is between 1 and 12
        // Display the month if valid
        // Display an error message if invalid

        System.out.print("Enter the month you were born (1-12): ");

        if (in.hasNextInt()) {

            birthMonth = in.nextInt();
            newLine = in.nextLine();

            if (birthMonth < 1 || birthMonth > 12) {
                System.out.println("You told me you were born in an illegal month: " + birthMonth);
            } else {
                System.out.println("You told me you were born in " + birthMonth);
            }

        } else {

            trash = in.nextLine();
            System.out.println("You must enter a valid month 1-12: " + trash);
        }
    }
}