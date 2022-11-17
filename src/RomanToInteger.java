import java.util.regex.Pattern;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

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

        while (!s.isEmpty()) {

            if (Pattern.compile("I").matcher(s).find()) {
                result += 1;
                s = s.replaceFirst("I", "");
            }

            if (Pattern.compile("V").matcher(s).find()) {
                result += 5;
                s = s.replaceFirst("V", "");
            }

            if (Pattern.compile("X").matcher(s).find()) {
                result += 10;
                s = s.replaceFirst("X", "");
            }

            if (Pattern.compile("L").matcher(s).find()) {
                result += 50;
                s = s.replaceFirst("L", "");
            }

            if (Pattern.compile("C").matcher(s).find()) {
                result += 100;
                s = s.replaceFirst("C", "");
            }

            if (Pattern.compile("D").matcher(s).find()) {
                result += 500;
                s = s.replaceFirst("D", "");
            }

            if (Pattern.compile("M").matcher(s).find()) {
                result += 1000;
                s = s.replaceFirst("M", "");
            }
        }
        return result;
    }
}
