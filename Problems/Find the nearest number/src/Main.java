import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrOfInts = readArrayList(scanner);

        ArrayList<Integer> result = minDistanceFromN(arrOfInts, scanner);

        Collections.sort(result);

        for (Integer val : result) {
            System.out.print(val + " ");
        }

    }

    private static ArrayList<Integer> minDistanceFromN(ArrayList<Integer> arr, Scanner scanner) {
        ArrayList<Integer> tempArr = new ArrayList<>();

        int n = scanner.nextInt();
        int distance = arr.get(0) - n;
        int minDistance = Math.abs(distance);
        for (Integer val : arr) {
            int currentDistance = val - n;
            if (Math.abs(currentDistance) < minDistance) {
                minDistance = Math.abs(currentDistance);
            }

        }

        for (Integer val : arr) {
            if (val - minDistance == Math.abs(n) || val + minDistance == n) {
                tempArr.add(val);
            }
        }


        return tempArr;
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}