public class RomanNumeralConverter {

    private RomanNumeralConverter() {
        throw new AssertionError("Utility class should not be instantiated.");
    }
    public static int romanToInt(final String romanInput) {
    
        if (romanInput == null || romanInput.trim().isEmpty()) {
            throw new IllegalArgumentException("Input Roman numeral string cannot be null or empty.");
        }

        int length = romanInput.length();
        int totalSum = 0;

        int currentValue = getSymbolValue(romanInput.charAt(0));

        for (int i = 0; i < length; i++) {

            int nextValue = (i + 1 < length) ? getSymbolValue(romanInput.charAt(i + 1)) : 0;

            if (currentValue < nextValue) {
                totalSum -= currentValue;
            } else {
                totalSum += currentValue;
            }

            currentValue = nextValue;
        }

        return totalSum;
    }

    private static int getSymbolValue(final char symbol) {
        switch (symbol) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral character encountered: '" + symbol + "'");
        }
    }

    public static void main(String[] args) {
        runTest("LVIII", 58); 
        runTest("MCMXCIV", 1994); 
        runTest("I", 1);
        try {
            RomanNumeralConverter.romanToInt("MCMX-INVALID");
        } catch (IllegalArgumentException e) {
            System.out.println("Success: Caught expected exception for invalid input -> " + e.getMessage());
        }
    }

    private static void runTest(String input, int expected) {
        int result = RomanNumeralConverter.romanToInt(input);
        if (result == expected) {
            System.out.println("Pass: " + input + " -> " + result);
        } else {
            System.err.println("Fail: " + input + " expected " + expected + " but got " + result);
        }
    }
}