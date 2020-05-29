package search;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        String fileDir = "/Users/macbookpro13/IdeaProjects/javastudy/src/file.txt";

        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equals("--data")) {
                fileDir = args[i + 1];
            }

        }


        List<String> listOfPeople = fileReader(fileDir);
        SearchingEngine searchingEngine = new SearchingEngine(listOfPeople);
        UserInteraction userInteraction = new UserInteraction(listOfPeople, searchingEngine);
        userInteraction.menu();


    }

    public static List<String> fileReader(String filePath) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath);

        List<String> listOfStrings = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (bufferedReader.ready()) {
                String stringFromFile = bufferedReader.readLine();
                listOfStrings.add(stringFromFile);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return listOfStrings;
    }


    public static String formatString(String string) {
        return string.toLowerCase().replaceAll(" ", "");
    }

}


class UserInteraction {

    List<String> listOfPeople;

    SearchingEngine searchingEngine;

    UserInteraction(List<String> listOfPeople, SearchingEngine searchingEngine) {
        this.listOfPeople = listOfPeople;
        this.searchingEngine = searchingEngine;
    }


    void menu() {
        boolean isActionZero = false;
        Scanner scanner = new Scanner(System.in);

        while (!isActionZero) {
            System.out.println("=== Menu ===");
            System.out.println("1. Find a person.");
            System.out.println("2. Print all people.");
            System.out.println("0. Exit");


            String action = scanner.nextLine();
            switch (action) {
                case "1":
                    System.out.println("Select a matching strategy: ALL, ANY, NONE");
                    String algType = scanner.nextLine();
                    switch (algType.toUpperCase()) {
                        case "ALL": {
                            System.out.println("Enter a name or email to search all suitable people.");
                            String query = scanner.nextLine();
                            List<Integer> searchRes = searchingEngine.findPeople(query, algType);

                            printSearchResult(searchRes);
                            break;
                        }
                        case "ANY": {
                            System.out.println("Enter a name or email to search all suitable people.");
                            String query = scanner.nextLine();
                            List<Integer> searchRes = searchingEngine.findPeople(query, algType);

                            printSearchResult(searchRes);
                            break;
                        }
                        case "NONE": {
                            System.out.println("Enter a name or email to search all suitable people.");
                            String query = scanner.nextLine();
                            List<Integer> searchRes = searchingEngine.findPeople(query, algType);

                            printSearchResult(searchRes);
                            break;

                        }
                        default: {
                            System.out.println("Incorrect strategy!");
                        }

                    }
                    break;
                case "2":
                    System.out.println("=== List of people ===");
                    printAllPeople(this.listOfPeople);
                    break;
                case "0":
                    System.out.println("Bye!");
                    isActionZero = true;
                    break;
                default:
                    System.out.println("Incorrect option! Try again.");
                    break;
            }
        }


    }

    public void printAllPeople(List<String> people) {
        for (String personData : people) {
            System.out.println(personData);

        }
    }

    void printSearchResult(List<Integer> searchResult) {
        if (searchResult != null) {
            System.out.println("Found people:");
            for (int i = 0; i < searchResult.size(); i++) {
                System.out.println(listOfPeople.get(searchResult.get(i)));
            }
        } else {
            System.out.println("No matching people found");
        }
    }
}


class SearchingEngine {


    Map<String, List<Integer>> invertedIndex;
    SearchSelectionContext ctx;


    SearchingEngine(List<String> listOfPeople) {

        this.invertedIndex = invertedIndex(listOfPeople);
        ctx = new SearchSelectionContext(this.invertedIndex);
    }


    List<Integer> findPeople(String input, String strategy) {
        ctx.switchToStrategy(strategy);
        return ctx.findPeople(input);
    }


    public Map<String, List<Integer>> invertedIndex(List<String> listOfStrings) {


        Map<String, List<Integer>> invertedMap = new HashMap<>();
        int strNumber = 0;


        for (String line : listOfStrings) {

            String[] wordsInLine = line.toLowerCase().split(" ");
            for (String word : wordsInLine) {
                if (invertedMap.containsKey(word)) {
                    invertedMap.get(word).add(strNumber);
                } else {
                    invertedMap.put(word, new ArrayList<>());
                    invertedMap.get(word).add(strNumber);
                }

            }
            strNumber++;

        }

        return invertedMap;

    }


}

class SearchSelectionContext {

    SearchStrategy selectedStrategy;

    SearchStrategyAll searchStrategyAll;
    SearchStrategyAny searchStrategyAny;
    SearchStrategyNone searchStrategyNone;

    SearchSelectionContext(Map<String, List<Integer>> index) {
        searchStrategyAll = new SearchStrategyAll(index);
        searchStrategyAny = new SearchStrategyAny(index);
        searchStrategyNone = new SearchStrategyNone(index);

    }

    void switchToStrategy(String strategy) {
        if (strategy.equalsIgnoreCase("all")) {
            selectedStrategy = searchStrategyAll;
        } else if (strategy.equalsIgnoreCase("any")) {
            selectedStrategy = searchStrategyAny;
        } else if (strategy.equalsIgnoreCase("None")) {
            selectedStrategy = searchStrategyNone;
        }
    }

    public List<Integer> findPeople(String query) {
        return this.selectedStrategy.find(query);
    }
}


interface SearchStrategy {

    List<Integer> find(String query);

}


class SearchStrategyAll implements SearchStrategy {

    Map<String, List<Integer>> index;
    List<Integer> result;

    public SearchStrategyAll(Map<String, List<Integer>> index) {
        this.index = index;
    }

    @Override
    public List<Integer> find(String query) {

        Set<Integer> set = new HashSet<>();

        String[] queryWords = query.toLowerCase().split(" ");
        for (String queryWord : queryWords) {
            if (index.containsKey(queryWord)) {
                if (set.isEmpty()) {
                    set.addAll(index.get(queryWord));
                } else {
                    set.retainAll(index.get(queryWord));
                }


            }


        }
        return result = new ArrayList<>(set);
    }
}


class SearchStrategyAny implements SearchStrategy {

    Map<String, List<Integer>> index;
    List<Integer> result;


    public SearchStrategyAny(Map<String, List<Integer>> index) {
        this.index = index;
    }

    @Override
    public List<Integer> find(String query) {
        Set<Integer> set = new HashSet<>();

        String[] queryWords = query.toLowerCase().split(" ");
        for (String queryWord : queryWords) {
            if (index.containsKey(queryWord)) {
                set.addAll(index.get(queryWord));
            }


        }
        return result = new ArrayList<>(set);
    }
}

class SearchStrategyNone implements SearchStrategy {

    Map<String, List<Integer>> index;
    List<Integer> result;

    public SearchStrategyNone(Map<String, List<Integer>> index) {
        this.index = index;
    }

    @Override
    public List<Integer> find(String query) {


        Set<Integer> set = new HashSet<>();
        for (String entry : index.keySet()) {
            set.addAll(index.get(entry));
        }

        String[] queryWords = query.toLowerCase().split(" ");
        for (String queryWord : queryWords) {
            set.removeAll(index.get(queryWord));
        }


        return result = new ArrayList<>(set);
    }
}




