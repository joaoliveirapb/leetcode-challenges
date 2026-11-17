package challenges.easy;

import java.util.Map;

public class RomanToInt {
    private static final Map<Character, Integer> ROMAN_SYMBOLS = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int fromRomanToInt(String s) {
        int total = 0;

//        for (int i = 0; i < s.length(); i++) {
//            int currentValue = ROMAN_SYMBOLS.get(s.charAt(i));
//            int nextValue = i + 1 < s.length() ? ROMAN_SYMBOLS.get(s.charAt(i + 1)) : 0;
//
//            if (currentValue >= nextValue) {
//                total += currentValue;
//            } else {
//                total -= currentValue;
//            }
//        }

        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            int currentValue = ROMAN_SYMBOLS.get(s.charAt(i));

            if (currentValue >= previousValue) {
                total += currentValue;
            } else {
                total -= currentValue;
            }

            previousValue = currentValue;
        }

        return total;
    }
}
