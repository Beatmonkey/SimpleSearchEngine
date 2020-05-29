import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] arr1 = new int[arraySize];

        int sum = 0;


        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        for (int val : arr1) {
            if (val > n ) {
                sum += val;
            }

        }


        System.out.println(sum);

        }

    }
