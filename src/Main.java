import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws AgeLessThanZeroException {

        System.out.print("Enter your age: ");
        int yourAge = keyboard.nextInt();
        validateAge(yourAge);
    }

    private static void validateAge(int age) throws AgeLessThanZeroException {
        if (age < 0) {
            throw new AgeLessThanZeroException("Age cannot be negative!");
        }
    }
}
