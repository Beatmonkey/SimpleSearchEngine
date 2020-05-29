import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boxSide = 3;
        int[] box1 = new int[boxSide];
        int[] box2 = new int[boxSide];


        // set values of box1
        for (int i = 0; i < boxSide; i++) {
            box1[i] = scanner.nextInt();
        }


        // set values of box2
        for (int i = 0; i < boxSide; i++) {
            box2[i] = scanner.nextInt();
        }

        //sort values in the boxes
        for (int i = boxSide - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (box1[j] > box1[j + 1]) {
                    int tmp = box1[j];
                    box1[j] = box1[j + 1];
                    box1[j + 1] = tmp;
                }
                if (box2[j] > box2[j + 1]) {
                    int tmp = box2[j];
                    box2[j] = box2[j + 1];
                    box2[j + 1] = tmp;
                }
            }
        }

        if ((box1[0] < box2[0] || box1[2] < box2[2]) && box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) {
            System.out.println("Box 1 < Box 2");
        } else if ((box1[0] > box2[0] || box1[2] > box2[2]) && box1[1] >= box2[1] && box1[0] >= box2[0] && box1[2] >= box2[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (box1[0] == box2[0] && box1[2] == box2[2] && box1[1] == box2[1]) {
            System.out.println("Box 1 = Box 2");
        } else {
            System.out.println("Incomparable");
        }


    }
}

