import java.util.Scanner;
import java.util.InputMismatchException;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        
        boolean validInput; // to track valid inputs
        
        // do-while loop for wall's height
        do {
            validInput = true; // Starts the assumption that the input will be valid
            System.out.print("Enter wall height in feet: ");
            try {
                wallHeight = scnr.nextDouble(); // scanner to read user input
                
                if (wallHeight <= 0) { // makes sure the input is greater than 0
                    System.out.println("Invalid input. Wall height must be greater than 0.");
                    validInput = false; // Repeats the loop
                }
            } catch (InputMismatchException e) { // Handle for invalid input 
                System.out.println("Invalid input. Please enter a number.");
                scnr.next(); // Clears invalid input from scanner 
                validInput = false; // repeats the loop
            }
        } while (!validInput); // repeats if input was invalid
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        // do-while loop for wall's width
        do {
            validInput = true; // Starts the assumption that the input will be valid
            System.out.print("Enter wall width in feet: ");
            try {
                wallWidth = scnr.nextDouble(); // Reads user input
                
                if (wallWidth <= 0) { // Checks if input is valid, greater than 0
                    System.out.println("Invalid input. Wall width must be greater than 0.");
                    validInput = false; // flag to repeat the loop
                }
            } catch (InputMismatchException e) { // Handle for invalid input
                System.out.println("Invalid input. Please enter a number.");
                scnr.next(); // Clears invalid input from scanner
                validInput = false; // flag to repeat the loop
            }
        } while (!validInput); // repeats if input was invalid

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        
        scnr.close(); // closes scanner

    }
}
