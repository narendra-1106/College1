import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class OddEvenException {

    public static void main(String args[]) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = sc.nextInt();

            if (num < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed!");
            }

            if (num % 2 == 0)
                System.out.println(num + " is an Even number.");
            else
                System.out.println(num + " is an Odd number.");
        }
        catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer!");
        }
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
