import java.util.*;

class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpellChecker spellChecker = new SpellChecker(scanner);

    }

}

class SpellChecker {

    Scanner scanner;

    Set<String> knownWords;
    List<String> textLines;
    Set<String> result;
    int d;
    int l;


    SpellChecker(Scanner scanner) {
        this.scanner = scanner;
        addWordsToSet(Integer.parseInt(scanner.nextLine()));
        addLinesToList(Integer.parseInt(scanner.nextLine()));


        searchWords(this.knownWords, this.textLines);
        printer(this.result);


    }

    public Set<String> addWordsToSet(int number) {

        this.knownWords = new HashSet<>();
        for (int i = 0; i < number; i++) {
//            print(scanner.nextLine());
            knownWords.add(scanner.nextLine().toLowerCase()); //mistake

        }
        return this.knownWords;
    }

    public List<String> addLinesToList(int number) {
        this.textLines = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            textLines.add(scanner.nextLine());


        }
        return this.textLines;
    }

    public Set<String> searchWords(Set<String> words, List<String> sentences) {
        this.result = new HashSet<>();
        for (String sentence : sentences) {
            String[] sentenceArr = sentence.split(" ");
            for (String word : sentenceArr) {
                if (!words.contains(word.toLowerCase())) {
                    result.add(word);
                }
            }

        }
        return this.result;
    }

    void printer(Set<String> result) {
        this.result = result;
        for (String word : result) {
            System.out.println(word);
        }
    }

    void print(String string) {
        throw new RuntimeException(string);
    }
}
