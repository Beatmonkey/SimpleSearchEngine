/* Please, do not rename it */
class Problem {

    public static void main(String args[]) {
//        String[] arrayStr = {"MIN", "7", "3", "4", "1", "8", "11", "3", "2"};
        String operator = args[0];

        if (operator.equals("MAX")) {
            int max = Integer.parseInt(args[1]);
            int a = 1;
            while (a < args.length) {
                if (Integer.parseInt(args[a]) > max) {
                    max = Integer.parseInt(args[a]);
                    a++;
                } else {
                    a++;
                }

            }
            System.out.println(max);
        } else if (operator.equals("MIN")) {
            int min = Integer.parseInt(args[1]);
            int a = 1;
            while (a < args.length) {
                if (Integer.parseInt(args[a]) < min) {
                    min = Integer.parseInt(args[a]);
                    a++;
                } else {
                    a++;
                }

            }
            System.out.println(min);

        } else if (operator.equals("SUM")) {
            int sum = 0;
            int a = 1;
            while ( a < args.length ) {
                sum = sum + Integer.parseInt(args[a]);
                a++;

            }
            System.out.println(sum);


        }



    }


    public static boolean isNumber(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;

    }
}