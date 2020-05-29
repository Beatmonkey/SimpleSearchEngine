class Problem {

    public static void main(String args[]) {
        String configPath;

        for (int i = 0; i < args.length; i += 2) {
            String configFormat = args[i + 1];

            System.out.println(args[i] + "=" + configFormat);


        }


    }
}