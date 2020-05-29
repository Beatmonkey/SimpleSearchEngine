import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] arr1 = new int[arraySize];

        int max = 0;
        int maxI = 0;


        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();

        }

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > arr1[i - 1] && arr1[i] > max) {
                max = arr1[i];
                maxI = i;
            } else if (arr1[i] < arr1[i - 1] && arr1[i] > max){
                max = arr1[i - 1];
                maxI = i - 1;
            }
        }
        System.out.println(maxI);
    }
}
