import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber;
        int prevNumber = 0;

        boolean isNumberZero = false;
        while (!isNumberZero) {
            currentNumber = scanner.nextInt();
            if (currentNumber > prevNumber) {
                prevNumber = currentNumber;

            } else if (currentNumber <= prevNumber && currentNumber != 0) {
                continue;
            } else if (currentNumber == 0) {
                isNumberZero = true;
            }
        }
        System.out.println(prevNumber);
    }
}