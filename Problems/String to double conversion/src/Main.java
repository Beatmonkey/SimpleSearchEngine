/**
 * It returns a double value or 0 if an exception occurred
 */



    public static double convertStringToDouble(String input) {
        try {
            Double.parseDouble(input);
        } catch (Exception NumberFormatException) {
            return 0;
        }

        return Double.parseDouble(input);
    }





