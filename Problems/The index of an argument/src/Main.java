import java.util.Scanner;

class Problem {
    public static void main(String[] args) {

        System.out.println(arrIndex(args));

    }

    public static int arrIndex (String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("test")) {
                return i;
            }
        }

        return -1;
    }
}