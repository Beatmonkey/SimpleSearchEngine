class Problem {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i += 3) {
            String plus = "+";
            String minus = "-";
            String multiple = "*";

            if (args[i].equals(plus)) {
                System.out.println(Integer.parseInt(args[i + 1]) + Integer.parseInt(args[i + 2]));
            } else if (args[i].equals(minus)) {
                System.out.println(Integer.parseInt(args[i + 1]) - Integer.parseInt(args[i + 2]));
            } else if (args[i].equals(multiple)) {
                System.out.println(Integer.parseInt(args[i + 1]) * Integer.parseInt(args[i + 2]));
            } else {
                System.out.println("Unknown operator");
            }
        }

    }
}