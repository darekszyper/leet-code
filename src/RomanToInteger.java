import java.util.regex.Pattern;

public class RomanToInteger {

    public static int romanToInt(String s) {
        int result = 0;

        if (Pattern.compile("IV").matcher(s).find()) {
            result += 4;
            s = s.replaceFirst("IV", "");
        }

        if (Pattern.compile("IX").matcher(s).find()) {
            result += 9;
            s = s.replaceFirst("IX", "");
        }

        if (Pattern.compile("XL").matcher(s).find()) {
            result += 40;
            s = s.replaceFirst("XL", "");
        }

        if (Pattern.compile("XC").matcher(s).find()) {
            result += 90;
            s = s.replaceFirst("XC", "");
        }

        if (Pattern.compile("CD").matcher(s).find()) {
            result += 400;
            s = s.replaceFirst("CD", "");
        }

        if (Pattern.compile("CM").matcher(s).find()) {
            result += 900;
            s = s.replaceFirst("CM", "");
        }

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I': result += 1; break;
                case 'V': result += 5; break;
                case 'X': result += 10; break;
                case 'L': result += 50; break;
                case 'C': result += 100; break;
                case 'D': result += 500; break;
                case 'M': result += 1000; break;
            }
        }
        return result;
    }
}
