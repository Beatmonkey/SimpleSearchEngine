import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        int numberOfwords = 0;
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int charFromInput = reader.read();
            //when first symbol is space
            while (charFromInput == '\u0020') {
                charFromInput = reader.read();
            }
            //when first symbol isnt space
            while (charFromInput != -1) {
                if (charFromInput == '\u0020') {
                    numberOfwords++;
                    charFromInput = reader.read();
                    while (charFromInput == '\u0020') {
                        charFromInput = reader.read();
                    }
                } else {
                    charFromInput = reader.read();
                }
            }
            if (numberOfwords == 0) {
                System.out.println(numberOfwords);
            } else {
                numberOfwords++;

                System.out.println(numberOfwords);
            }
        }
    }

}