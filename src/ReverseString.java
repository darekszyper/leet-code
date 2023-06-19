import java.util.Scanner;

public class ReverseString {
    public static String firstReverse(String str) {
        int lastLetter = str.length() - 1;

        StringBuilder reversedString = new StringBuilder();
        for (int i = lastLetter; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }

        return reversedString.toString();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(firstReverse(s.nextLine()));
    }
}
