import java.util.Scanner;

public class Main {

    public static String prepareFullName(String firstName, String lastName) {
        String fullName;
        if (firstName != null && lastName != null) {
            fullName = firstName + " " + lastName;
            return fullName;
        } else if (firstName == null) {
            fullName = lastName;
            return fullName;
        } else {
            fullName = firstName;
        }

        return fullName;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}