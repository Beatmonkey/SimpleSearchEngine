import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isNumZero = false;

        while (!isNumZero) {
            String num = scanner.nextLine();
            if (num .equals("0")) {
                isNumZero = true;
                break;
            }
            try {
                stringHandler(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + num);
                continue;
            }
            System.out.println(stringHandler(num));

        }



    }







    public static int stringHandler(String string) {
        int number = Integer.parseInt(string) * 10;
        return number;
    }
}