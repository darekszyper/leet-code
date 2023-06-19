import java.util.Scanner;

public class InterviewSearchingChallenge {
    // Take the str parameter being passed and return the first word with the greatest number of repeated letters.
    // For example "Today, is the greatest day ever!" should return "greatest" because it has 2 e's (and 2 t's) and
    // it comes before "ever" which also has 2 e's. If there are no words with repeating letters return "-1".
    // Words will be separated by spaces.
    // Once your function is working, take the final output string and concatenate it with your token "cgdhcgd2323",
    // and then replace every fourth character with an underscore.

    public static String searchingChallenge(String str) {
        String token = "cgdhcgd2323";
        String result;
        int resultIndex = 0;
        int count = 1;
        int temp;

        String[] strArray = str.toLowerCase().replaceAll("[,.!?]", "").split(" ");

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length(); j++) {
                temp = 0;
                for (int k = 0; k < strArray[i].length(); k++) {
                    if (strArray[i].charAt(j) == strArray[i].charAt(k)) {
                        temp++;
                    }
                }
                if (temp > count) {
                    resultIndex = i;
                    count = temp;
                }
            }
        }

        if (count > 1) {
            strArray = str.replaceAll("[,.!?]", "").split(" ");
            result = strArray[resultIndex];
        } else result = "-1";

        result = result + token;
        char[] resultCharArray = result.toCharArray();

        for (int i = 3; i < resultCharArray.length; i += 4) {
            resultCharArray[i] = '_';
        }
        result = new String(resultCharArray);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("0")) {
            input = scanner.nextLine();
            System.out.println(searchingChallenge(input));
        }
    }
}
