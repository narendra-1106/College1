import java.util.*;

public class ExcpThrow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int a = sc.nextInt();

        if (a < 5) {
            throw new ArithmeticException("Please enter a value greater than 5");
        }

        System.out.println("You entered: " + a);
    }
}
