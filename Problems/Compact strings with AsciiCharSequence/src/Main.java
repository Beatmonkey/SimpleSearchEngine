import java.lang.reflect.AccessibleObject;

class AsciiCharSequence implements CharSequence {

/*
    public static void main(String[] args) {

        byte[] byteArr = new byte[10];
        byteArr[0] = 'a';
        byteArr[1] = 'b';
        byteArr[2] = 'c';
        byteArr[3] = 'd';
        byteArr[4] = 'e';
        byteArr[5] = 'f';
        byteArr[6] = 'g';
        byteArr[7] = 'h';
        byteArr[8] = 'i';
        byteArr[9] = 'g';

        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(byteArr);
        System.out.println(asciiCharSequence.length());

        System.out.println(asciiCharSequence.charAt(5));

        System.out.println(asciiCharSequence.subSequence(4, 10).toString());


    }
*/

    byte[] asciChars;

    AsciiCharSequence(byte[] asciChars) {
        this.asciChars = asciChars;
    }

    @Override
    public int length() {
        int lengthCounder = 0;
        for (int i = 0; i < asciChars.length; i++) {
            lengthCounder++;
        }
        return lengthCounder;
    }

    @Override
    public char charAt(int i) {

        return (char) asciChars[i];
    }


    @Override
    public CharSequence subSequence(int i, int i1) {
        byte subSeqAsciChars[] = new byte[i1 - i];
        for (int j = 0; j < subSeqAsciChars.length; j++) {
            subSeqAsciChars[j] = asciChars[i];
            i++;
        }
        return new AsciiCharSequence(subSeqAsciChars);
    }


    @Override
    public String toString() {
        return new String(asciChars);
    }
}