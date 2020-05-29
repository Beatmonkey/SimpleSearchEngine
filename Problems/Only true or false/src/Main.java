class Primitive {

    public static void main(String[] args) {
        System.out.println(toPrimitive(false));
    }

    public static boolean toPrimitive(Boolean b) {
        if (b == null) {
            return false;
        } else if (b == false) {
            return false;
        } else {
            return true;
        }
    }
}