import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        int counter = 0;
        byte[] chars = new byte[52];
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int charFromInput = reader.read();
            while (charFromInput != - 1) {
                chars[counter] = (byte) charFromInput;
                charFromInput = reader.read();
                counter++;
            }
            for (int i = chars.length-1; i >= 0; i--){
                if (chars[i] != '\u0000')
                System.out.print((char) chars[i]);
            }



        }
    }
}