import java.util.*;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class UserExcp {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");

            int a = sc.nextInt();

            if (a < 5) {
                throw new MyException("Enter number greater than 5");
            }

            System.out.println("You entered: " + a);
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
