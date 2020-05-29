import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);

        String expression = scannerStr.nextLine();
        String[] values =  expression.split(" ");
        Long a = Long.parseLong(values[0]);
        String operation = values[1];
        long b = Long.parseLong(values[2]);




        switch (operation) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(a / b);
                }
                break;
            case "*":
                System.out.println(a * b);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

    }
}